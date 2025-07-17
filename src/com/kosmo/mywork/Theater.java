package com.kosmo.mywork;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

class TheaterGUI extends JFrame{
    public TheaterGUI(int[][] seat) {
        setTitle("영화관 좌석 예매");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel seatPanel = new JPanel();
        seatPanel.setSize(300, 300);
        seatPanel.setLayout(new GridLayout(5, 6, 60, 60));
        JLabel titleLabel = new JLabel("영화 예매 시스템", JLabel.CENTER);
        titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
        JLabel bookingLabel = new JLabel("예약률:0.00% ",JLabel.CENTER);
        bookingLabel.setFont(new Font("맑은 고딕",Font.BOLD,40));


        char seatChar = 'A';
        JButton btn = null;
        for (int i = 0; i < seat.length; i++) {// [5][6] 버튼 출력하려함 잘안됨
            for (int j = 0; j < seat[i].length; j++) {
                String label = (char)('A'+i)+ String.valueOf(j+1);
                btn = new JButton(label);
                seatPanel.add(btn);



                int finalI = i;
                int finalJ = j;
                JButton finalBtn = btn;
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(seat[finalI][finalJ]==0){
                            seat[finalI][finalJ] =1;
                            bookingRate(seat,bookingLabel);
                            finalBtn.setBackground(Color.BLACK);
                            JOptionPane.showMessageDialog(null,"예약완료");

                        }else {
                            JOptionPane.showMessageDialog(null,"예약불가");
                        }
                    }
                });
            }
        }


        add(seatPanel);
        add(titleLabel, BorderLayout.NORTH);
        add(bookingLabel, BorderLayout.SOUTH);
        setVisible(true);
    }



    private void bookingRate(int [][]seat, JLabel label){
        int count =0;
        for (int[] row: seat){
            for (int val:row){
                if (val ==1){count++;}
            }
        }
        double rate = 100*(count/30.0);
        label.setText(String.format("예약률:%.2f%%",rate));
    }
}




public class Theater {
    public static void main(String[]args){
        TheaterGUI gui = new TheaterGUI(new int[5][6]);





    }
}
