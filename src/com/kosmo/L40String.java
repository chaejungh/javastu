package com.kosmo;

public class L40String {
    public static void main(String[] args) {
        //문자열
        String s = "안녕"; //문자열
        char [] s2 = {'안','녕'};// "안녕을 선언하면 생성되는 데이터
        //문자열 == 배열 (공정길이, 불변데이터)
        s+="잘가";
        System.out.println(s);//"안녕"따로 "잘가" 따로 "안녕 잘가 "따로
        // "AB" + "CD" => "ABCD"  --> 실제로 생기는 데이터는 "AB", "CD", "ABCD" 세개


        // + concat() : 배열을 합치는 함수의 이름
        s = s.concat("!");
        s+="~";
        System.out.println(s);

        //문자열 더하기(+) 연산은 수의 더하기 연산보다 우선순위가 높다(먼저 연산)
        System.out.println("문자열"+2+2);

        //  "" : 문자열의 리터럴(있는 그대로) 표기법
        //10, 10l, 10.0, 10.0f, true, false, ''

        //문자열 리터럴 표기법을 사용하면..
        //* 같은 문자열을 새로만들면 새로만들지않고 기존의 문자열을 참조
        // 왜? 문자열은 많이 사용되기에 메모리 절약을 위해 이런 방식으로 한다
        System.out.println("안녕" == "안녕"); // 문자열, 배열은 불변
        System.out.println("안녕" == new String("안녕"));




        //문자열의 유용한 함수들
        String str = "ABCDEFG";
        //Array[index], List.get(index), String.charAt(index);
        System.out.println(str.charAt(2));
        System.out.println(str.substring(1,3));// List.subList();
        System.out.println("str.substring(): "+str.substring(5));
        //삭제 : x List.remove(i)
        //수정 : x List.set(index,Obj)
        //더하기 : x List.add(Obj)
        //전체삭제 : x List.clear()
        //정렬: XX
        //반복자(Iterator) : xxx List.iterator()

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        int[]arr={10,20,30};
        System.out.println();

        /// Array 반복자가 없음
        for (int n : arr){// 컴파일러ㅓ가 자동완성
            //for (int i = 0; i < arr.length; i++) { int n =arr[i];}
            System.out.print(n+",  ");
        }
        //subString()을 제일 많이 사용
    }
}
