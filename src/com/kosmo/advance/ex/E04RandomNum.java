package com.kosmo.advance.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.kosmo.advance.ex.BtnHandler;
/*
* 4. 1~50 랜덤 숫자 맞추기 게임 (Higher)

목표:
	•	텍스트 입력창에 수를 입력하여 “정답 숫자”를 맞추는 간단한 미니게임
	•	정답에 도달하면 “축하합니다!” 표시
	*   기회 3번 (도전) -> cnt==2
	*   게임 다시 시작(도전)   cnt=0;
*/

class NumInputHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class RandomNum extends JFrame {
    int cnt;
    int ans;
    int num;
    Random ran; //랜덤으로 받을 값
    final int MAX_CNT=3;
    private JButton btn;
    private JButton btn2;
    private JPanel panel;
    private JPanel panel2;
    private JLabel label;
    private JLabel label2;
    private JTextField field;
    RandomNum(){
        super("Random Number game");
        this.panel = new JPanel(new FlowLayout());
        this.btn = new JButton("시작");
        this.btn2 = new JButton("종료");
        this.label = new JLabel("1~50까지의 수를 맞추시오: ");
        this.label2 = new JLabel("");
        this.field = new JTextField();
//        field.setSize(80,30);


        btn.addActionListener(new ActionListener() { //시작
            @Override
            public void actionPerformed(ActionEvent e) {
                ran = new Random();
                num = ran.nextInt(50);
                label2.setText("남은 기회: "+MAX_CNT+"정답: "+num);
                cnt =0;
            }
        });
        field.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            ans = Integer.parseInt(field.getText());
            if(num != ans && cnt<=3){
                cnt++;
                label.setText("땡!! 다시 시도해보세요");
                label2.setText("남은 기회: "+(MAX_CNT-cnt)+"정답: "+num);
                if (num<ans){label.setText("Down!");}
                else label.setText("UP!");
            } else if ((num == ans) && cnt<=3 ) {
                label.setText("정답: "+num+" 정답 입니다!");
                label2.setText((cnt+1)+"번 만에 맞추셨습니다");
                cnt++;
            }

            if(cnt == MAX_CNT){
                label.setText("기회 끝!");
                label2.setText("다음 기회에");
            }
            }
        });


        panel.add(btn);
        panel.add(btn2);
        this.add(panel,BorderLayout.NORTH);
        this.panel2 = new JPanel();
        panel2.setLayout(null);
        field.setBounds(200,0,200,20);
        label.setBounds(0,0,220,20);
        label2.setBounds(0,50,220,20);
        panel2.add(field);
        panel2.add(label);
        panel2.add(label2);
        panel2.add(new Panel());
        this.add(panel2);

        super.setBounds(0,0,500,500);
        super.setVisible(true);

    }



}
public class E04RandomNum {
    public static void main(String[] args) {
        RandomNum ran = new RandomNum();
    }
}
