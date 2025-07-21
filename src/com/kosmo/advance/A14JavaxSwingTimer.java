package com.kosmo.advance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;


public class A14JavaxSwingTimer {
    public static void main(String[] args) throws InterruptedException {
        // javax.swing.Timer : java.util.Timer 처럼 스케줄링 스레드 작성에 사용됨
        //사용 방법이 다름
        // EDT(Event Dispatch Thread) : 이벤트를 스레드에게 배달하고 처리하는 일꾼 !!
        //동작 원리 : 이벤트 큐 (1개의 스레드가 멀티스레드처럼 동작)
        //JFrame 에 존재하는 EDT 로 동작하기 때문에 JFrame 객체가 화면에 없으면 동작하지 않음
        JFrame jFrame = new JFrame("Timer 실습");
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi");
            }
        });
        timer.start();
        int cnt =0;
        JButton jButton = new JButton("시계");
        JLabel label = new JLabel("시간 출력");
        JPanel panel = new JPanel();
        jFrame.add(label);
        jFrame.add(jButton, BorderLayout.NORTH);
        jButton.addActionListener((e)->{
             Timer timer2 = new Timer(1000,(ae)->{
                label.setText(LocalDateTime.now().toString());

            });
            timer2.start();

        });
        System.out.println("끝");
        jFrame.setBounds(0,0,200,200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        Thread.sleep(1000*10);
        timer.stop();

    }
}
