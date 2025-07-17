package com.kosmo;
import java.util.Scanner;
public class L12While {
    public static void main(String[]args) throws InterruptedException{
        //while 반복문 : 같은 동작을 반복 실행
        //현관에 형광등 : 사람이 지나가는지 검사. 지나가면 on, 10초 후 off
        int i =2;
        while (true){
            if(i==1)break;
            else{ System.out.println("hah");break;}
        }
        //보통 무한반복문을 일정 주기마다 쉬도록 작성
        int sum = 0;;
//        while(true){
//            //실행 == Thread (실행하는 일꾼)
//            Thread.sleep(300);
//            //sleep: 실행을 잠시 쉬게함(오류 발생 가능성이 존재해ㅏㅁ)
//            System.out.println("hi");
//            sum+=1;
//            if(sum ==10)break;
//        }


        int[] nums = {11,22,33,44,55,66};
        int ii = 0;
        while(ii<5){
            System.out.println(nums[ii++]);

        }
        /* 배열을 탐색하는 while 반복문의 공식
        * int i =0; 선언문
        *while(i<arr.length){조건문
        * i++; 증감문
        * }
        *
        * */
        //배열의 모든 자료를 검색하고 싶다.

        //do{} while(조건식) : 조건과 상관없이 첫번째는 무조건 실행


        Scanner scan = new Scanner(System.in);
        //자바를 실행하는 터미널에서 키보드 입력을 받겠다.

        String line = scan.nextLine(); //입력을 기다리는 무한 반복문(문자열 입력 후 라인개행 즉 엔터를 하면 입력한 문자열을 가져옴) == input

        System.out.println("input:"+line);


    }
}
