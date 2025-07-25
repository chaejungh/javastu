package com.kosmo.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A16Reader {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        //인코딩 처리 및 2바이트씩 받을 수 있는
        InputStreamReader isr = new InputStreamReader(inputStream,"utf-8");
        int a;
        String str = "";
        StringBuilder sb = new StringBuilder();
        while ((a = isr.read()) != -1){ //무한 반복
            //break: 반복문 종료
            //continue: 반복문의 한구간만 건너뜀
            if ((char)a=='\n')break;
            System.out.println(a+":"+(char) a);
            str+= (char)a;
            sb.append((char)a);//문자열은 불변데이터기 떄문에 호출하는 즉시 생성
//            안녕
//            50504 // 문자열을 2바이트 씩 처리
//            45397
        }
        System.out.println(str);
        //1바이트씩 2바이트 씩 문자열 처리하면 구ㅏ찮아서 버퍼로 한줄식 받기가능
        BufferedReader bufferedReader = new BufferedReader(isr);
        str = bufferedReader.readLine();
        System.out.println("버퍼로 받은 한줄"+str);

        //**Scanner : BufferedReader 보다 기능이 많고 inputStream 으로 바로 변환가능
        // BufferedReader 보다 데이터 변환 속도가 느리고 메모리 차지를 많이함
        //InputStreamReader 처럼 인코딩 변환이 다양하지 않음
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        System.out.println("스캐너로 받은 한줄"+str);

        InputStream inputStream1 = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream1);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
        //BufferedReader를 사요ㅕㅇ하기 위한 과정
        //1바이트 -> 2바이트-> 2바이트 짜리 버퍼로  변환
    }
}
