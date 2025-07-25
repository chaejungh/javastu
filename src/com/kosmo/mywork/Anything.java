package com.kosmo.mywork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import java.io.*;
import java.net.*;
import java.util.*;

public class Anything extends JPanel implements KeyListener {

    final int TILE_SIZE = 20;
    final int WIDTH = 30, HEIGHT = 30;
    int myId = -1;
    boolean myAlive = true;

    Map<Integer, LinkedList<Point>> snakes = new HashMap<>();
    Map<Integer, Integer> scores = new HashMap<>();
    Map<Integer, Boolean> alive = new HashMap<>();
    Point food = new Point(10, 10);

    Socket socket;
    PrintWriter out;

    public Anything() {
        setPreferredSize(new Dimension(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE + 40));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        try {
            socket = new Socket("192.168.0.39", 9999);
            out = new PrintWriter(socket.getOutputStream(), true);
            new Thread(() -> listen()).start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "서버 연결 실패: " + e.getMessage());
            System.exit(0);
        }
    }

    void listen() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                if (line.startsWith("ID:")) {
                    myId = Integer.parseInt(line.substring(3));
                } else {
                    parseGameState(line);
                    repaint();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "서버와 연결이 끊어졌습니다.");
            System.exit(0);
        }
    }

    void parseGameState(String msg) {
        snakes.clear();
        scores.clear();
        alive.clear();
        for (String token : msg.split(";")) {
            if (token.isEmpty()) continue;
            if (token.startsWith("FOOD:")) {
                String[] t = token.substring(5).split(",");
                food = new Point(Integer.parseInt(t[0]), Integer.parseInt(t[1]));
            } else if (token.startsWith("SCORE")) {
                int idx = token.indexOf(":");
                int pid = Integer.parseInt(token.substring(5, idx));
                int sc = Integer.parseInt(token.substring(idx + 1));
                scores.put(pid, sc);
            } else if (token.startsWith("ALIVE")) {
                int idx = token.indexOf(":");
                int pid = Integer.parseInt(token.substring(5, idx));
                boolean isAlive = token.substring(idx + 1).equals("1");
                alive.put(pid, isAlive);
                if (pid == myId) myAlive = isAlive;
            } else if (token.contains(":")) {
                String[] t = token.split(":");
                int pid = Integer.parseInt(t[0]);
                LinkedList<Point> list = new LinkedList<>();
                for (String p : t[1].split("\\|")) {
                    if (p.isEmpty()) continue;
                    String[] xy = p.split(",");
                    list.add(new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])));
                }
                snakes.put(pid, list);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!myAlive) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                out.println("RESTART");
            }
            return;
        }
        int dx = 0, dy = 0;
        if (e.getKeyCode() == KeyEvent.VK_LEFT)  { dx = -1; dy = 0; }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) { dx = 1;  dy = 0; }
        if (e.getKeyCode() == KeyEvent.VK_UP)    { dx = 0;  dy = -1; }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)  { dx = 0;  dy = 1; }
        if (dx != 0 || dy != 0) {
            out.println("DIR:" + dx + "," + dy);
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        for (int id : snakes.keySet()) {
            if (id == myId) g.setColor(Color.GREEN);
            else            g.setColor(Color.YELLOW);
            for (Point p : snakes.get(id)) {
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
        g.setColor(Color.WHITE);
        int x = 10, y = HEIGHT * TILE_SIZE + 25;
        for (int id : scores.keySet()) {
            String label = (id == myId ? "나" : "플레이어" + id) + ": " + scores.get(id);
            g.drawString(label, x, y);
            x += 120;
        }
        if (!myAlive) {
            g.setFont(new Font("굴림", Font.BOLD, 40));
            g.setColor(Color.RED);
            g.drawString("Game Over!", 80, 200);
            g.setFont(new Font("굴림", Font.PLAIN, 18));
            g.setColor(Color.YELLOW);
            g.drawString("스페이스바를 누르면 다시 시작!", 70, 320);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("멀티플레이 Snake Game");
        Anything panel = new Anything();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
