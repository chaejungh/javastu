package com.kosmo;

public class L02Data {
    public static void  main(String[]args){
        /*
        프로그램은 계산(연산)을 하거나 출력,입력을 할 때 모든 것을 데이터로 저장합니다.
        자바는 연산을 위해 숫자 데이터(기본,원시 형)와 관리를 위한 데이터(자료형)로 나누어 저장합니다.
        수학적 연산
        + - * / % >> << ..
        숫자 데이터(실수, 정수)
         */
        System.out.println(12.33);
        System.out.println(13);
        System.out.println(13/3);
        System.out.printf("%.2f",13/3.0);//실수 정수==> 연산 실수가 반환된다(return)

        //자바는 참(1)과 거짓(0)을 표현하는 boolean 데이터가 있습니다
        //비교연산자 ( A>B, <, ==, !=, >=, <=)
        System.out.println(2<3);
        System.out.println(1==1);
        System.out.println("ABCD");
        System.out.println('A');
        // 숫자만 다루기 때문에 모든 번호로 치환해서 사용함
        //파일 인코딩이 utf-8: utf-8의 문자표를 이용ㅎ해서 문자를 번호로 치환
        System.out.println((int)'A');// ASCII 코드

        //'' : 문자 데이터는 정수 데이터입니다
        //기본형(수): 정수(int), 실수(float), boolean, char

        System.out.println('A'+'A');

        //System.out.println(true+true); 자바 문법적으로 X
        //자료형 데이터: 데이터를 묶어서 관리

        int[] nums= {80, 90, 100};//배열 자료형
        //int []: 데이터 타입, 정수로 된 배열
        //nums : 생성한 데이터를 참조하는 이름 변수
        System.out.println(nums[0]);
        //배열: 순서가 있는 배열

        char[] arr = {'H','e', 'l', 'l', 'o'};
        String str = "Hello";//문자열 자료형(arr 과 str의 데이터는 같다 )
        System.out.println(str);
        str = new String("bye");// 객체 자료형 => str = "Bye; 가 대신할 수 있다
        System.out.println(str);


    }
}
