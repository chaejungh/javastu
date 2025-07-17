package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Arrays;




class BtnHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class ClickTimer extends JFrame {
    JButton btn;
    JButton btn2;
    JButton btn3;
    JLabel label;
    JPanel panel;
    int count = 0;
    int cnt=0;
    boolean isTimerStart =false;
    ClickTimer(){
        super("Timer");
        this.label = new JLabel("타이머"+ count,SwingConstants.CENTER);
        btn = new JButton("타이머 시작");
        btn2 = new JButton("중단");
        btn3 = new JButton("클릭");
        panel = new JPanel(new FlowLayout());
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("카운트: "+String.valueOf(count));
            }
        });

        btn.addActionListener(new ActionListener() { //타이머 실행 버튼
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isTimerStart){
                    new Thread(()->{// 5초뒤에 중단하는 스레드하나
                        timer.start();
                        isTimerStart = true;
                        btn.setText("타이머 작동 중");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                        timer.stop();
                        isTimerStart = false;
                        label.setText("클릭 횟수: "+cnt+", 초당 클릭 횟수: "+(cnt/count));
                        count=0;
                    }).start(); //그리고 다른 스레드 실행
                }
            }
        });
        btn2.addActionListener(new ActionListener() { // 타이머 중단 버튼, 중단하면 클릭횟수 출력
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isTimerStart){
                    timer.stop();
                    isTimerStart = false;
                    label.setText("클릭 횟수: "+cnt+", 초당 클릭 횟수: "+(cnt/count));
                    count=0;
                }
            }
        });
        btn3.addActionListener(new ActionListener() {// 클릭 버튼

            @Override
            public void actionPerformed(ActionEvent e) {
                if(isTimerStart){
                    cnt++;
                }
            }
        });
        this.add(label);
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
        this.add(panel,BorderLayout.NORTH);

        this.setBounds(0,0,500,500);
        super.setVisible(true);
        super.setDefaultCloseOperation(2);
    }




}





public class E2Timer {
    public static void main(String[] args) {
        ClickTimer clickTimer = new ClickTimer();
    }
}
