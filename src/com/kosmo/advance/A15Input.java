package com.kosmo.advance;

import java.io.IOException;
import java.io.InputStream;

public class A15Input {
    public static void main(String []args)throws IOException {
        //터미널의 문자열 입력을 자바 어플에서 받기
        InputStream in = System.in;
        //InputStream.read(); 입력받는 함수
//        int a = in.read(); //try catch 로 예외처리를 해야하지만 예외위임으로 처리
//        System.out.println(a);
        //ABCD/n => 입력
        //65 66 67 68
        //입력 출력은 기본적으로 1byte
        //데이터가 없으면 -1 or \n 일때까지
        int a;
        in = System.in;
        while (( a = in.read()) != -1){
            System.out.println(a);
            //안녕 => utf-8 한글 3바이트
            //236,149,136
            //235,133,149
            //자바는 utf16 2byte로 한글을 사용하기 때문에 인코딩 변환을 해야 한글을 제대로 출력받을 수 있다.
        }
    }
}
