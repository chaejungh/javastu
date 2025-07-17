package com.kosmo;

import javax.crypto.interfaces.PBEKey;

public class L34Method {
    //[접근 지정자] [메모리 영역] [반환타입] [이름] [매개변수] : 메소드
    //클래스 변수로 저장된 sum은 매개변수를 더해서 반환하는 기능을 수행하는 코드 집합
    public static int sum(int a,int b){
        int sum =a+b;
        return sum;//함수의 종료 시점

    }
    //배열중에 데이터가 모두 수이면 true, 수가 아닌 것이 있으면 false를 반환하는 검사식 함수 생성
    public static boolean isNum(Object o){
        //수인지 아닌지 검사해서 맞으면 true 아니면 false
        //o 수 데이터면
        //20 => Integer

        boolean isNum=false;
//        if (o instanceof Number){isNum = true;}
        isNum = (o instanceof Number);
        return isNum;
    }
    public static boolean isNum(Object arr[]){
        //수인지 아닌지 검사해서 맞으면 true 아니면 false
        boolean isNum =false;
        for (int i=0;i< arr.length;i++){
            Object o =arr[i];
            isNum = (arr[i] instanceof Number);
            System.out.println(i+"번째:"+o+" "+ (isNum));
            if(!isNum) return false;
            //break : 반복문을 종료하는 명령
            //continue : 해당 지점을 건너뛴다
        }
        return isNum;
    }
    public static void main(String[] args) {
        //메소드: 특정 기능을 수행하는 코드 집합(블럭)
        //메소드 호출 방법 : 이름(매개변수);
        int s = sum(10,20);
        System.out.println(s);
        System.out.println(isNum(3));

        Object [] arr = {1,2,3,4,5};
        Object [] arr1 = {1,2,3,4,"as","6"};
        System.out.println(isNum(arr));
        System.out.println(isNum(arr1));
    }
}
