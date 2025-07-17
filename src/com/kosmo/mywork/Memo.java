package com.kosmo.mywork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Memo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Memo App");

        // 컴포넌트 생성
        JLabel label = new JLabel("메모장입니다");
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click!");
        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Open");

        // 레이아웃 설정
        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(button, BorderLayout.WEST);
        frame.add(saveButton, BorderLayout.SOUTH);
        frame.add(openButton, BorderLayout.EAST);

        // 이벤트 리스너
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다!");
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);

                if(option ==JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();//선택한 파일
                    try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
                        textArea.setText("");
                        String line;
                        while((line = reader.readLine())!=null){
                            textArea.append(line+"\n");
                        }
                        JOptionPane.showMessageDialog(frame,"파일을 열었습니다");
                    }catch (IOException ex){
                        JOptionPane.showMessageDialog(frame,"파일 열기 중 오류 발생");
                        ex.printStackTrace();
                    }

                }
            }
        });


        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(frame);// 저장 다이얼로그 표시

                if(option == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();//사용자가 선택한 파일

                    try (
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                        writer.write(textArea.getText()); //텍스트 영역 내용 저장
                        JOptionPane.showMessageDialog(frame, "저장되었습니다"+file.getAbsolutePath());
                    }   catch (IOException ex){
                        JOptionPane.showMessageDialog(frame, "파일 저장 중 오류 발생!");
                        ex.printStackTrace();
                    }
                }
            }
        });

        // 프레임 설정
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
