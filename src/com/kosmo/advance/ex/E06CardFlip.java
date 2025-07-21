package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
// 처음 모두 흰색 -> 시작버튼 누르면 5초동안 색깔위치보여줌 -> 그다음 모두 흰색으로 체인지 -> 두개 눌러서 색깔이 일치하면 승리, 일치하지않는다면 다시 플립 (시간제한 3분)
class CardFlip extends JFrame{
    int cnt;
    JButton[] btn = new JButton[16];
    JButton startBtn;
    JPanel panel2;
    JPanel panel;
    JLabel label;
    ArrayList<Color> li = new ArrayList<>(16);
    ArrayList<Color> li2 = new ArrayList<>(16);



    CardFlip(){
        super("CardFlip");
        this.startBtn = new JButton("시작");
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));
        li2.add(new Color(255,255,255));


        li.add(new Color(255,0,0)) ;
        li.add(new Color(255,0,0)) ;
        li.add(new Color(0,255,0)) ;
        li.add(new Color(0,255,0)) ;
        li.add(new Color(0,0,255)) ;
        li.add(new Color(0,0,255)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;
        li.add(new Color(0,0,0)) ;


        this.panel = new JPanel();
        this.panel2 = new JPanel();
        for (int i = 0; i < btn.length; i++) {
            this.btn[i] = new JButton();
            panel.add(btn[i]);

            btn[i].setBackground(li2.get(getRandomNum()));

            int finalI = i;
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int c = getRandomNum();
                    btn[finalI].setBackground(li.get(c));
                    if(li.get(c).equals(Color.BLUE)||li.get(c).equals(Color.GREEN)||li.get(c).equals(Color.RED)){
                        cnt++;
                        if (cnt ==6){
                            label.setText("승리");
                            return;
                        }
                    }
                    li.remove(c);

                }
            });
        }

        this.label = new JLabel("카드 뒤집기 게임");

        super.add(label);
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
