package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.event.*;

public class E0444 extends JFrame {
    private int count = 0;        // 클릭 카운트 변수
    private boolean timerStarted = false; // 타이머 시작 여부
    private Timer timer;          // javax.swing.Timer 객체
    private JButton button;
    private JLabel label;

    public E0444() {
        setTitle("버튼 클릭 시 타이머 시작");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // 절대 위치 지정

        button = new JButton("시작!");
        button.setBounds(100, 30, 100, 30);

        label = new JLabel("카운트: 0");
        label.setBounds(100, 70, 150, 30);

        // 타이머 미리 생성해두고 멈춘 상태
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("카운트: " + count);
            }
        });
        timer.setRepeats(true); // 반복 실행

        // 버튼 클릭 시 타이머 시작
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!timerStarted) {
                    timer.start();        // 타이머 시작
                    timerStarted = true; // 다시 누르면 안 시작되게 막음
                    button.setText("타이머 작동 중"); // 버튼 상태 표시
                }
            }
        });

        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new E0444();
    }
}
