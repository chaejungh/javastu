package com.kosmo.advance.ex;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

class CardFlip2 extends JFrame {

    class ColorBtn extends JButton{
        private int r;
        private int g;
        private int b;

        private Color color;
        private boolean isFlip = true;//t=색 f=흰
        private boolean isSelected;

        @Override
        public String toString() {
            return "ColorBtn{" +
                    "r=" + r +
                    ", g=" + g +
                    ", b=" + b +
                    ", isFlip=" + isFlip +
                    '}';
        }

        public ColorBtn(){
            color=new Color(0,0,0);
//            this.setBackground(color);
//            this.setOpaque(true);

            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    flip();
                }
            });
        }


        public ColorBtn(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
            color=new Color(r,g,b);
            this.setBackground(color);
            this.setOpaque(true);
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    flip();
                    cnt++;
                }
            });
        }
        public void threadFlip() {

            if (isFlip) {
                this.setBackground(new Color(255, 255, 255));
            } else {
                this.setBackground(color);
            }
            isFlip = !isFlip;
        }
        public void flip(){
            if(isFlip){
                this.setBackground(new Color(255,255,255));
            }else{
                this.setBackground(color);
            }
            //this.revalidate();
            isFlip=!isFlip;
            cardHold++;
            if(cardHold ==1){
                li2.add(this);
            } else if (cardHold == 2) {
                li2.add(this);
                if(li2.get(1).equals(new ColorBtn())){
                    JOptionPane.showMessageDialog(pane,"검정 오답입니다");
                    cardHold=0;
                    System.out.println(cardHold);
                    li2.get(0).setBackground(new Color(255,255,255));
                    li2.get(1).setBackground(new Color(255,255,255));

                } else if (li2.get(0).equals(li2.get(1))) {
//                    this.isSelected = true; //선택된 버튼은 플립 불가
                    cardHold=0;
                    this.setEnabled(false);
                }else {
                    cardHold = 0;
                    System.out.println(cardHold);
                    li2.get(0).setBackground(new Color(255, 255, 255));
                    li2.get(1).setBackground(new Color(255, 255, 255));
                    JOptionPane.showMessageDialog(pane, "오답입니다");
                }
            }
        }

        public boolean equalsRGB(ColorBtn o) {
            return r == o.r && g == o.g && b == o.b;
        }

    }
    int cnt;
    int cardHold;
    ColorBtn [] btn;
    JButton startBtn;
    JPanel panel;
    JPanel panel2;
    JLabel label;
    JOptionPane pane;
    List<ColorBtn> li = new Vector<>();
    List<ColorBtn> li2 = new Vector<>();
    CardFlip2(){
        super("CardFlip");
        this.pane = new JOptionPane();
        this.startBtn = new JButton("시작");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.label = new JLabel("",SwingConstants.CENTER);
        this.btn = new ColorBtn[16];

        startBtn.addActionListener(e -> {
            Collections.shuffle(li);
            panel=new JPanel();
            panel.setLayout(new GridLayout(4,4,30,30));
            for(ColorBtn btn : li){
                panel.add(btn);
            }
            CardFlip2.this.add(panel);
            CardFlip2.this.revalidate();
            new Thread(()->{

                try {Thread.sleep(2000);} catch (InterruptedException ee) {System.out.println("");}
                for(ColorBtn btn : li){
                    btn.threadFlip();
                }
                try {Thread.sleep(100);} catch (InterruptedException ee) {System.out.println("");}
                CardFlip2.this.revalidate();

            }).start();

        });
        li.add(new ColorBtn(255,0,0)) ;
        li.add(new ColorBtn(255,0,0)) ;
        li.add(new ColorBtn(0,255,0)) ;
        li.add(new ColorBtn(0,255,0)) ;
        li.add(new ColorBtn(0,0,255)) ;
        li.add(new ColorBtn(0,0,255)) ;
        for (int i = 0; i < 10; i++) {
            li.add(new ColorBtn(0,0,0)) ;
        }
        panel.setLayout(new GridLayout(4,4,30,30));
        for(ColorBtn btn:li){
            panel.add(btn);
        }
        this.add(panel);


        panel2.add(startBtn);
        panel2.add(label);
        this.add(panel2,BorderLayout.NORTH);

        super.setBounds(0,0,500,500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
public class E0601CardFlip {
    public static void main(String[] args) {
        CardFlip2 ca = new CardFlip2();
    }
}
