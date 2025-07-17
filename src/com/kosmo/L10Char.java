package com.kosmo;

public class L10Char {
    public static void main(String[]args){
        char c ='A';// 문자표의 번호

        //아스키코드(ASCII) 0~127 : 영문자+키보드 문자표(컴퓨터에서 사용하기 위해 최초로 만들어짐)
        //모든 문자표는 아스키코드를 포함하고 있다.
        //MS949 : 윈도우 OS에서 사용
        //UNICODE: 국제표준 문자표 (utf-8(1 byte~ 4 byte),utf-16(2바이트 또는 4바이트))
        //utf-8 :1~4byte 문자를 표현, 이때 한글은 3바이트
//        utf-16 : 2 or 4 바이트로 문자 데이터를 저장, 한글은 3byte 이모지 4바이트
        //utf -16 : 2 or 4 byte로 문자데이터를 저장 한글 2바이트 이모지 4바이트
        System.out.println((int)'A'); //65
        System.out.println((int)'가');//44032 <= 16진수
        //FF 1111 1111 1byte
        //A1FF 2byte
        //Integer : int 기본형을 돕는 랩퍼 클래스
        System.out.println(Integer.toHexString(44032));
//        c ='😊';
//        char c2 = '😍'; 자바는 문자를 2바이트까지 저장가능
        String s = "😍";
        char uu = '\u0041';
        char u='\uAAAA';
        System.out.println(u);
        System.out.println(uu);
        //자바의 문자는 2바이트 고정 크기이다
        char n=80;
        System.out.println(n);
        n = 60000;
        System.out.println(n);
    }
}
