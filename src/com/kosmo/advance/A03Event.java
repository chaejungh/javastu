package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A03Event {
    static int num =0;
    static JLabel label;
   static class BtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //클릭했을때 호출되는 함수 => 콜백 함수
            num++;
            label.setText(num+"");
            System.out.println(num);

        }
    }

    public static void main(String[] args) {
        //GUI 는 마우스 이벤트로 인터페이스가 구성됨
        //클릭, over(enter), leave, focus
        JFrame frame = new JFrame("Event");

        JButton btn = new JButton("배고픈만큼 누르기");
        int num =0;
        //btn.addActionListener();
        //이벤트리스너 : (동작인식 형광등) 이벤트를 대기(*)하고 있다가 정의한 동작을 실행
        //ActionListener : 버튼 클릭 이벤트

        //버튼을 누를때 동작(콜백 함수)을 정의해서 매개변수로 전달
        //콜백함수: 어떤 동작에의해 호출된 함수(개발자가 임의로 실행하는 함수가 아님)


         label = new JLabel(num +"",SwingConstants.CENTER);

        //모든 컴포넌트를 Font글 자체를 변경 가능
        label.setFont(new Font("맑은 고딕",Font.BOLD,32));
        frame.add(btn, BorderLayout.NORTH);
        frame.add(label);// BorderLayout.Center

        btn.addActionListener(new BtnHandler());

        frame.setSize(500,500);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);


    }
}
