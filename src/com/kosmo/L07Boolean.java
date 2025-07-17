package com.kosmo;

public class L07Boolean {
    public static void main(String[] args){
        boolean b = true; // true ==> 1인 데이터
        //자바의 논리형은 산술적 연산이 불가함
        b = false; //0인 데이터
        //논리형인 boolean의 데이터의 크기는 1bit 지만 주소체ㅔ계가 1byte 단위기 때문에
        //1 byte 크기에 기본형 데이터 타입 입니다.

        //논리형은 비교연산의 결과로 반환되는 데이터
        // ==,, !=, >, <, >=,, <= (기본형의 연산)
        // <>: 사용불능
        //자료형의 비교연산
        // ==, !=
        int [] nums = {1,2,3,4};
        int [] nums2 = {1,2,3,4};
        boolean c = 1<3;
        System.out.println(c);

        char[] chars ={'h','e','l','l','o'};
        char[] chars2 ={'h','e','l','l','o'};
        String str ="hello";
        String str2 ="hello";
        System.out.println(str2 == str);
        //자료형 중에 문자열만 ""(리터럴하게) 정의하면 똑같은 문자열을 찾아서 참조한다.
        //문자열은 통신과 같은 특수한 상황에서 기존 문자열을 찾지않고 새로 만들기 때문에 False를 반환할 가능성이 있다
        //때문에 자료형을 == 비교하는것은 좋지않다
        System.out.println(" ");
        //자료형의 equals 는 자료내의 모든 값을 비교해서 같을 때만 true를 반환
        //자료형은 무조건 equals를 사용.
        System.out.println(str.equals(str2));


        //논리 연산자
        // &&(AND), ||(OR), !(NOT)
        //true 1  false 0

        //true  || false = true
        //false  || false = false
        //true  || true = true

        // true  && false = false
        // false  && false = false
        //true  && true = true

        System.out.println((1>0) &&(10<2)); //false
        System.out.println((1>0) || (10<2)); //true
        System.out.println((1>0) && !(10<2)); //true




    }
}
