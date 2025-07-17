package com.kosmo;

public class L08If {
    public static void main(String[] args){
        //조건문 if : 프로그램의 분기를 만들때 사용합니다.
        //if(논리형){실행할 블럭}
        if (true){// {블럭, scope}
            System.out.println("hi");
        }
        if(false){
            System.out.println("Bye");
        }
        int a = -10;

        int b = 10;
        if(a>=10) System.out.println("a is bigger or same");
        if(a<0){
            System.out.println("minus");}
        else{
            System.out.println("plus");
        }
        //if(1+10){} //결과가 논리형인경우만 가능
        //if(1){} // 1== true 라 생각하는 언어는 가능( 자바 불가능)
        //if("안녕"){} // 존재하는것은 true 라 생각하는 언어( 자바 불가능)
        int score = 75;
        //false && t&& t&& t&& t&& t&& t&& t => 자바가 첫번째 연산에서 멈춘다
        //자바가 단락평가/지연평가(논리연산을 파악하는 단계)를 진행
        if(score>100){
            System.out.println("error enter your score properly");
        }
        else if (score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        }else if (score>=70) {
            System.out.println("C");
        }else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }



    }
}
