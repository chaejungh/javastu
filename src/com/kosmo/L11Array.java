package com.kosmo;
import java.util.Arrays;;
public class L11Array {
    public static void main(String[]args){
        //배열 Array : 순서와 길이가 있는 자료형
        //자바의 배열 : 타입이 같은 자료가 순서와 길이가 있는 자료형, 길이변경(고정길이)이 안됨
        // [] <== 베열
        // 자료형을 만들때는 꼭 new 연산자를 사용 => 자료를 메모리에 저장
        // 메모리에 저장된 자료를 객체라고 부른다
        int[] nums = new int[5]; // { 0,0 ,0 ,0 ,0 }
        String [] strs = new String[3];//{null, null, null}
        nums[0] = 1; // [index] : 순서 0부터 시작
        nums[1] = 10;
        nums[2] = 100;
        nums[3] = 1000;
        nums[4] = 10000;
//        nums[5] = 100000; //컴파일시 발견되지 않는 오류(런타임 오류)
        //[] Array : 메모리가 작고 기능이 최소화
        System.out.println(nums.toString());
        System.out.println(strs);
        //L => 참조형데이터(자료형, 객체)
        //Arrays : array 를 도와주는 유틸 클래스(랩퍼클래스 : 기본형)
        System.out.println(Arrays.toString(nums));//{0,0,0,0,0]
        System.out.println(Arrays.toString(strs));

        System.out.println(nums[1]);
        System.out.println(nums[4]);

        strs[0] = "잘가";
        strs[1] = "안녕";
        strs[2] = "맛있게 드세요";
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        //.ArrayIndexOutOfBoundsException : 존재하지 않는index 참조 오류
        //Exception 오류가 뜨는 예외를 처리했어
        //thread 실행
    }
}
