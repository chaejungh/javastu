package com.kosmo;
//deploy(배포): 서비스, 라이브러리
//public class: import 가능한 클래스
//import : 프로그램이 실행시 라이브러리를 가져와서 같이 실행
import java.lang.*;// 자바 어플이 실행될때 꼭 필요한 클래스의 집합
//System : 자바 어플을 실행하는 터미널(cmd)을 접근(모든 Os는 터미널이 어플을 실행)
//Integer, Double, Short,Character: 랩퍼 클래스(기본형 데이터를 돕는 클래스)
public class L13Review {
    //main 함수가 있어야 자바 어플이 된다.
    public static void main(String[]args) throws InterruptedException{
        int a = 10; //데이터 10이 생기고
//        int i 변수가데이터 10을 참조
//        정수형 : byte, short, int(**), long
//        실수형: float, double(**)
//        문자형 : char
//        부울형:boolean
        //문자형 = '';  유니코드(utf-16)의 문자표의 번호를 참조
        //문자열형 = "";
        char c  = '\u0000';//0000 0000 0000 0000
        c = '가';
        System.out.println((int)c);
        System.out.println(Integer.toHexString(c));

        //변수 데이터를 다른것으로 참조 가능

        //상수 : 처음 참조한 데이터를 바꿀 수 없는 것(constant)
        //보통 바뀌지 않는 정보성 데이터를 정의하기 위해 사용됨
        final double PI = 3.141592;


        //if, else, else if
        //switch
        //while
        int age = 70;
        if(age>=60){//분기 (조건이 true일때 실행되는 분기)
            System.out.println("주류할인");
        }else if(age>=20){
            // else if : 복잡한 분기를 생성(위쪽 분기가 만족되지 않을때 실행)
            System.out.println("주류 구입");
        }else{
            System.out.println("미성년자는 구입 불가");
        }

        //20 -> 2 66->6
        switch(age/10){
            case 2,3,4,5:
                System.out.println("주류 구입");break;
            case 6,7,8,9,10:
                System.out.println("주류할인");break;
            default:
                System.out.println("미성년자ㅏ 구입 불가");break;
        }

int i=1;
        while(true){

            Thread.sleep(20000);
            System.out.printf("%d초",20*i);
            i+=20;
        }

    }
}
