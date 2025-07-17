package com.kosmo;

public class L09Switch {
    public static void main(String[]args){
        //switch
        //else if 같은 분기가 많고 조건이 간단할때 작성하는 조건물
        //if 보다 연산속도가 빠르다
        int a =8;
        switch (a){
            case 0://if(a==0)
                System.out.println("a는 0");
                break;
            case 1://if(a==1)
                System.out.println("a is 1");
                break;
            case 2://if(a==2)
                System.out.println("a is 2");
                break;
            default:
                System.out.println("a is none if them");
        }
        //java 14 때 도입
        int weekNum = 3;// 0 Mon 1 Tue 2 Wed 3 Thu 4 Fri 5 Sat 6 Sun
        String week =null;

        switch(weekNum){
            case 0: week="Mon"; break;
            case 1: week="Tues"; break;
            case 2: week="Wednes"; break;
            case 3: week="Thurs"; break;
            case 4: week="Fri"; break;
            case 5: week="Satur"; break;
            case 6: week="Sun"; break;
            default: week = "Wrong";
        }



//java 14 부터 쓰는 문법
        // -> 를 사용하면 바로 변수가 데이터를 참조,  break 생략
        String weekStr =switch(weekNum){
            case 0->"Mon";
            case 1->"Tues";
            case 2->"Wednes";
            case 3->"Thurs";
            case 4->"Fri";
            case 5->"Satur";
            case 6->"Sun";
            default-> "Wrong";
        };
        System.out.println("Today is "+weekStr+"day.");
        //switch는 변수의 동등비교만 가능합니다
        //변수의 데이터가 기본형이어야함. 자료형은 문자열(Java 7 부터)과 enum만 가능합니다
        //스위치가 제한은 많지만 분기의 가독성이 좋고 비교연산이 빠르다.

        int n=4671333;
        switch(n/1000000){
            case 1,3:
                System.out.println("남자");break;
            case 2,4:
                System.out.println("여자");break;
            default:
                System.out.println("error");break;
        }
    }
}
