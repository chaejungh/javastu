package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A01Swing {
    public static void main(String[] args) {
        //GUI : OSX Apple사의 최초의 운영체제가 => MS Window,
        // IOS 모바일(터치) => 구글 안드로이드
        //CLI

        //자바!! 플랫폼에 독립적으로 윈도우를 구현
        //window :

        JFrame f = new JFrame(); // awt 패키지
        //BorderLayout

        f.setBounds(1000,0,900,300);

        //Label : 글자를 추가하는 컴포넌트
        JLabel l  = new JLabel("hi~");
        JLabel l2  = new JLabel("bye");

        // Container에 컴포넌트를 추가하는 함수
        f.add(l,BorderLayout.NORTH);
        f.add(l2,BorderLayout.CENTER);




        f.setVisible(true);


        //JFrame :: swing 패키지
        //awt 패키기가 나온지 오래돼서 플랫폼간의 일관성이 부족해짐
        //이를 보ㅇ완하기 위해 java1.2에서 swing을 발표
        //java FX java 6 버전(swing 후속작), html 같은 스타일 적용이 가능
        // awt, swing(*), fx


        // 컨테이너와 컴포넌트
        // swing 에는 Container를 구현하는 클래스와 Component를 구현하는 클래스로 나뉜다
        // 컨테이너 클래스는 컴포넌트를 포함하기 위해 존재
        // Container 에는 Layout Manager 라는 클래스가 포힘되는데
        // Component의 위치를 조정한다.

    }
}
