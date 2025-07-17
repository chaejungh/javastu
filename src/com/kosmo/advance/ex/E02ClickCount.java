package com.kosmo.advance.ex;

//2. 클릭 카운터 앱 (Medium)
//
//        목표: 버튼을 여러 번 클릭한 횟수를 저장하고 출력
//        •	기능:
//        •	누른 횟수 누적 (클릭 수: 25)
//        •	리셋
//        •	클릭 속도 계산 (선택 사항)
//        •	도전:
//        •	Timer 사용해서 초당 클릭 수 계산
//          1`스레드: 클릭세기
        //  2스레드:
//        ⸻

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.TimerTask;
import java.util.Timer;
import java.util.Calendar;
class Click extends JFrame {
    int cnt ;
    int timeCnt;
    JLabel label;
    JLabel label2;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JOptionPane jOptionPane;
    JPanel panel;
    class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    Click(){
        super("클릭 카운트 앱");
        this.label = new JLabel("누른 횟수: "+this.cnt,SwingConstants.CENTER);
        this.label2 = new JLabel("시간"+this.timeCnt,SwingConstants.LEADING);
        this.btn1 = new JButton("누른 횟수");
        this.btn2 = new JButton("리셋");
        this.btn3 = new JButton("시작");
        this.panel = new JPanel();
        panel.setLayout(new FlowLayout());
        Timer timer = new Timer();
        String time = getTime();


        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                    String time = getTime();
                    label.setText(time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },10000);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cnt++;
                timeCnt++;
                label.setText("누른 횟수: "+cnt);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cnt=0;
                jOptionPane = new JOptionPane();
                JOptionPane.showMessageDialog(jOptionPane, "cnt가 리셋되었습니다");
                label.setText(cnt+"");
            }
        });




        this.add(label);
        this.add(label2);
        panel.add(btn1);
        panel.add(btn2);
        this.add(panel,BorderLayout.NORTH);
        label.setFont(new Font("맑은 고딕",Font.BOLD,33));
        label2.setFont(new Font("맑은 고딕",Font.BOLD,33));
        this.setBounds(0,0,500,500);
        super.setVisible(true);
        super.setDefaultCloseOperation(2);




    }
    public String getTime(){
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int sec = c.get(Calendar.SECOND);

        String time = hour+":"+min+":"+sec;
        return time;
    }
}
public class E02ClickCount {
    public static void main(String[] args) {
        Timer timer = new Timer();

        Click click =new Click();

    }
}
