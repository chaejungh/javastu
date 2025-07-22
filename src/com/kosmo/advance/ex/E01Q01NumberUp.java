package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.kosmo.advance.ex.BtnHandler;
//class BtnHandler implements ActionListener{
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//}
public class E01Q01NumberUp {
    public static void main(String[] args) {
        //swing GUI
        JFrame jFrame = new JFrame("Number UP");
        JButton button = new JButton("숫자 1씩 증가");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JLabel label = new JLabel("0",SwingConstants.CENTER);
        label.setFont(new Font("맑은 고딕",Font.BOLD,30));
        jFrame.add(button,BorderLayout.NORTH);
        jFrame.add(label, BorderLayout.CENTER);
        jFrame.setSize(200,200);
        jFrame.setLocation(0,0);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
