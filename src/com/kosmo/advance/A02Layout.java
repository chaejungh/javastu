package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A02Layout {


    public static void main(String[] args) {
        JFrame frame = new JFrame("레이아웃 수업");
        //Frame => window, 모든 컨테이너의 부모
        JButton btn1 = new JButton("1번");
        JButton btn2 = new JButton("2번");
        JButton btn3= new JButton("3번");

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        frame.add(p, BorderLayout.NORTH);

        JLabel label = new JLabel("안녕!");

        frame.add(label);// 중간에 두고 싶을때엔 "Center" 생략 가능

        frame.setBounds(0,0,500,500);
        frame.setVisible(true);

        //라벨 3개를 카드레이아웃으로 구성하고 버튼을 누르면 카드가 변경되도록 구현


    }
}
