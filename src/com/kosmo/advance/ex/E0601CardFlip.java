package com.kosmo.advance.ex;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class CardFlip2 extends JFrame {
    private ColorBtn blackColorBtn=new ColorBtn();

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
            this.setBackground(color);
            this.setOpaque(true);

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

            isFlip=!isFlip;
            cardHold++;
            if(cardHold ==1){
                li2.add(this);
            } else if (cardHold == 2) {
                li2.add(this);
                ColorBtn btn1=(ColorBtn) li2.get(0);
                ColorBtn btn2=(ColorBtn) li2.get(1);


                li2.clear();
//                try {Thread.sleep(1000);} catch (InterruptedException ee) {System.out.println("");}
                if(btn2.equalsRGB(blackColorBtn) || btn1.equalsRGB(blackColorBtn)){
                    JOptionPane.showMessageDialog(CardFlip2.this,"검정 오답입니다");
//                    try {Thread.sleep(100);} catch (InterruptedException ee) {System.out.println("");}
                    cardHold=0;
                    System.out.println(cardHold);
                    btn1.setBackground(new Color(255,255,255));
                    btn2.setBackground(new Color(255,255,255));
                    btn1.isFlip=false;
                    btn2.isFlip=false;
                }else if (btn1.equalsRGB(btn2)) {
//                    this.isSelected = true; //선택된 버튼은 플립 불가
                    cnt++;
                    cardHold=0;
//                    this.setEnabled(false);

//                    try {Thread.sleep(1000);} catch (InterruptedException ee) {System.out.println("");}

                }else {
                    cardHold = 0;
                    System.out.println(cardHold);
                    JOptionPane.showMessageDialog(CardFlip2.this, "오답입니다");
//                    try {Thread.sleep(100);} catch (InterruptedException ee) {System.out.println("");}

                    btn1.setBackground(new Color(255, 255, 255));
                    btn2.setBackground(new Color(255, 255, 255));
                    btn2.isFlip=false;
                    btn1.isFlip=false;
                }
            if(cnt==3){
                JOptionPane.showMessageDialog(CardFlip2.this, "승리!");
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
    List<JButton> li = new Vector<>();
    List<JButton> li2 = new Vector<>();
    Timer timer;
    CardFlip2(){
        super("CardFlip");
        this.pane = new JOptionPane();
        this.startBtn = new JButton("시작");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.label = new JLabel("",SwingConstants.CENTER);
        this.btn = new ColorBtn[16];

        timer=new Timer(2000,(e)->{
            for(JButton btn : li){
                ColorBtn card=(ColorBtn)btn;
                card.threadFlip();
            }
            CardFlip2.this.revalidate();
            timer.stop();
        });
        startBtn.addActionListener(e -> {
            Collections.shuffle(li);
            panel=new JPanel();
            panel.setLayout(new GridLayout(4,4,30,30));
            for(JButton btn : li){
                panel.add(btn);
            }
            CardFlip2.this.add(panel);
            CardFlip2.this.revalidate();
            timer.start();

        });
        JButton btn1=new ColorBtn(255,0,0);
        JButton btn2=new ColorBtn(255,0,0);
        JButton btn3=new ColorBtn(0,255,0);
        JButton btn4=new ColorBtn(0,255,0);
        JButton btn5=new ColorBtn(0,0,255);
        JButton btn6=new ColorBtn(0,0,255);
        li.add(btn1) ;
        li.add(btn2) ;
        li.add(btn3) ;
        li.add(btn4) ;
        li.add(btn5) ;
        li.add(btn6) ;
        for (int i = 0; i < 10; i++) {

            JButton btn7=new ColorBtn(0,0,0);
            li.add(btn7) ;
        }
        panel.setLayout(new GridLayout(4,4,30,30));
        for(JButton btn:li){
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
