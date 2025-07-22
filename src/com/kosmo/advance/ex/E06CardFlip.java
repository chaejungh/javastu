package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import com.kosmo.advance.ex.BtnHandler;

// 처음 모두 흰색 -> 시작버튼 누르면 5초동안 색깔위치보여줌 -> 그다음 모두 흰색으로 체인지 -> 두개 눌러서 색깔이 일치하면 카운트++, 일치하지않는다면 다시 플립 (시간제한 3분)
//세개 다 맞추면 승리

class CardFlip extends JFrame{
    int cnt;
    int cntDown;
    int cardHold;
    final int MAX_CARD_HOLD = 2;
    ColorBtn[] btn = new ColorBtn[16];
    JButton startBtn;
    JPanel panel2;
    JPanel panel;
    JOptionPane pane;
    JLabel label;
    ArrayList<Color> li = new ArrayList<>(16);
    ArrayList<Color> li2 = new ArrayList<>(16);
    ArrayList<Color> li3 = new ArrayList<>(2);

    class ColorBtn extends JButton{
        private int r;
        private int g;
        private int b;

        private Color color;
        private boolean isFlip=true;//t=색 f=흰
        public ColorBtn(){
            color=new Color(0,0,0);
        }


        public ColorBtn(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
            color=new Color(r,g,b);
            this.setBackground(color);
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
        public void flip(){
            if(isFlip){
                this.setBackground(new Color(255,255,255));
            }else{
                this.setBackground(color);
            }
            isFlip=!isFlip;
        }
        public void threadFlip(){
            new Thread(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ColorBtn colorBtn = (ColorBtn) o;
            return r == colorBtn.r && g == colorBtn.g && b == colorBtn.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r, g, b);
        }
    }

    CardFlip(){
        super("CardFlip");
        this.startBtn = new JButton("시작");
        this.pane = new JOptionPane();
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));
//        li2.add(new Color(255,255,255));

        li.add(new Color(255,0,0)) ;
        li.add(new Color(255,0,0)) ;
        li.add(new Color(0,255,0)) ;
        li.add(new Color(0,255,0)) ;
        li.add(new Color(0,0,255)) ;
        li.add(new Color(0,0,255)) ;
        for (int i = 0; i < 10; i++) {
            li.add(new Color(0,0,0)) ;
        }
        setList();
        for (int i = 0; i < li.size(); i++) {
            btn[i] = new ColorBtn();
            btn[i].setBackground(li.get(i));
        }
        Timer timer = new Timer(1000,null);

        timer.addActionListener(new ActionListener() {
            int cntDown = 5;
            @Override
            public void actionPerformed(ActionEvent e) {
                cntDown--;
                label.setText("카운트: "+cntDown);
                if (cntDown<0){
                    timer.stop();
                }
            }
        });
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < li.size(); i++) {
                    int finalI = i;
                    btn[i].setBackground(li.get(i));
                    panel.add(btn[finalI]);
                    CardFlip.this.revalidate();
                    panel.revalidate();
                    new Thread(()->{
                        timer.start();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ee) {
                            throw new RuntimeException(ee);
                        }
                        timer.stop();
                        //btn[finalI].setBackground(true);
                        CardFlip.this.revalidate();
                    }).start();

                }

            }
        });



        this.panel = new JPanel();
        this.panel2 = new JPanel();

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(cardHold);
//                new Thread(()->{
//                    try{
//                    timer.start();
//                        Thread.sleep(5000);
//                    } catch (Exception ex) {
//                        throw new RuntimeException(ex);
//                    }
//                    timer.stop();
//                }).start();
//                if (cardHold == 0){
//                    cardHold++;
//
//                        btn.setBackground(li.get());
//                        li3.add(li.get());//크기가 두개인 리스트에 색깔 값을 담는다
//
////
//
//
//                } else if (cardHold == 1){
//                    cardHold++;
//                    new Thread(() -> {//5초뒤에 종료
//                        timer.start();
//
//                        btn[finalI1].setBackground(li.get(finalI1));
//                        li3.add(li.get(finalI1));//크기가 두개인 리스트에 색깔 값을 담는다
//
//                        timer.stop();
//
//
//                        if((li3.get(0).equals(li3.get(1)) )&& (li3.get(0)!= Color.BLACK)){
//                            cnt++;
//                            cardHold =0;
//                            li3.clear();
//                        } else if((li3.get(0).equals(Color.BLACK)) || (li3.get(1).equals(Color.BLACK))){
//                            JOptionPane.showMessageDialog(pane, "오답입니다");
//                            li3.clear();
//                            cardHold =0;
//                            for (int j = 0; j < li2.size(); j++) {
//                                btn[j].setBackground(li2.get(j));
//                            }
//                        } else {
//                            JOptionPane.showMessageDialog(pane, "오답입니다");
//                            li3.clear();
//                            cardHold =0;
//                            for (int j = 0; j < li2.size(); j++) {
//                                btn[j].setBackground(li2.get(j));
//                            }
//                        }
//                        if (cnt ==3){
//                            JOptionPane.showMessageDialog(pane, "승리!!");
//                        }
//
////                            li.remove(finalI1);
//
//                    }).start();
//                }else {
//                    JOptionPane.showMessageDialog(pane, "오답입니다");
//                    for (int j = 0; j < li2.size(); j++) {
//                        btn.setBackground(li2.get(finalI));
//                    }
//
//                }
//
//            }
//        });


        this.label = new JLabel("카운트: "+cntDown,SwingConstants.CENTER);

        panel2.add(label);
        this.add(panel);
        panel.setLayout(new GridLayout(4,4,30,30));

        super.add(panel2,BorderLayout.NORTH);
        panel2.add(startBtn);


        super.setBounds(0,0,500,500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }

//cnt=4;
//[[255,0,0,f],[255,0,0,f],[0,255,0,f],[0,255,0,t],[0,0,255,f],[0,0,255,f]]
//1. 시작 할때, 리스트 생성. 랜덤 값으로 하나를 뽑으면 그 인덱스는 삭제 -
//2. 인덱스마다 마지막 값에 flag를 넣어서 선택여부를 확인
    // if(true(이미 선택된)) -> 이미 선택 된 인덱스 (반복)
    // if(false(이미 선택된)) -> cnt++ -> flag = true;


    private int getRandomNum(){
        Random random = new Random();

        return random.nextInt(li.size());
    }
    private void setList(){

        Collections.shuffle(li);
    }

//    private Color getRealColor(){
//        Random random = new Random();
//        int a = random.nextInt(16);
//
//        return li.get(a);
//    }
}
public class E06CardFlip {
    public static void main(String[] args) {
      CardFlip cf = new CardFlip();

    }
}
