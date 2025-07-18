package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextHitInfo;
import java.util.Random;

import com.kosmo.advance.ex.BtnHandler;

class CardFlip extends JFrame{
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    JButton startBtn;
    JPanel panel2;
    JPanel panel;
    JLabel label;

    CardFlip(){
        super("CardFlip");
        this.btn1 = new JButton();
        this.btn2 = new JButton();
        this.btn3 = new JButton();
        this.btn4 = new JButton();
        this.startBtn = new JButton("시작");
        this.panel = new JPanel();

        this.panel2 = new JPanel();
        this.label = new JLabel("카드 뒤집기 게임");

        super.add(label);
        this.add(panel);
        panel.setLayout(new GridLayout(4,4,30,30));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        btn1.setBackground(getRandomColor());
        btn2.setBackground(getRandomColor());
        btn3.setBackground(getRandomColor());
        btn4.setBackground(getRandomColor());
//        btn1.setBounds(0,0,10,30);
//        btn2.setBounds(30,0,10,30);
//        btn3.setBounds(60,0,10,30);
//        btn4.setBounds(90,0,10,30);

        super.add(panel2,BorderLayout.NORTH);
        panel2.add(startBtn);


        super.setBounds(0,0,500,500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }



    private Color getRandomColor(){
        Random random = new Random();
        int red =random.nextInt(256);
        int blue =random.nextInt(256);
        int green =random.nextInt(256);
        return new Color(red,green,blue);
    }
}
public class E06CardFlip {
    public static void main(String[] args) {
      CardFlip cf = new CardFlip();

    }
}
