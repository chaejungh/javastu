package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//counter ++,-- 안보고 만들기
//  1. 숫자 증가 게임 (Easy)
//
//  목표: 버튼을 누를 때마다 숫자가 1씩 올라가고, 100이 되면 “완료!” 표시
//	•	기능:
//        •	숫자 증가 버튼
//	•	리셋 버튼
//	•	100 이상일 때 메시지 출력 (JOptionPane)
//	•	학습 포인트: 상태 관리, 조건 분기, 레이블 갱신
class Counter extends JFrame{

    private int num ;
    private JLabel label ;
    private JButton btn1;
    private JButton btn2;
    private JPanel panel=new JPanel();
    JOptionPane jOptionPane = new JOptionPane();
    class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    public Counter(){
           super("숫자증가게임");
           this.label = new JLabel(this.num+"",SwingConstants.CENTER);
           this.btn1 = new JButton("숫자 증가 버튼++");
           this.btn2 = new JButton("리셋");
           this.panel.setLayout(new FlowLayout());
           btn1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   num++;
                   label.setText(num+"");
                   if (num==10){
                       JOptionPane.showMessageDialog(jOptionPane, "10번 클릭되었습니다");
                   }
               }
           });
           btn2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   num=0;
                   label.setText(num+"");
               }
           });
           this.add(label);
           panel.add(btn1);
           panel.add(btn2);
           this.add(panel,BorderLayout.NORTH);
           label.setFont(new Font("맑은 고딕",Font.BOLD,33));
           this.setBounds(0,0,500,500);
           super.setVisible(true);
           super.setDefaultCloseOperation(2);

    }


}

public class E01Counter {

    public static void main(String[] args) {
        Counter counter = new Counter();
    }
}
