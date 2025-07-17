package com.kosmo;

public class L35RecursiveMethod {

    public static void call()throws java.lang.InterruptedException{
        Thread.sleep(10000);
        System.out.println("hi");
        call();
    }
    public static int sum(int i){//10
        int sum=0;

        if (i<=0)return sum;
        sum(i-1);
        return i+sum(i-1);
    }

    public static void main(String[] args) throws java.lang.InterruptedException{
       // call();// StackOverflowError
//        Stack 메모리 넘쳐서 오류
//        main이 실행하는 코드는 Stack 메모리에 저장(Stack이 가득찼다는건 메모리가 가득 찼다는것)
//        재귀함수 때문에 메모리가 빠르게 가득차서 넘쳐흐르는 상황
//        재귀함수는 꼭 종료시점을 정하거나(****), 실행속도를 늦춘다


        /// 1~ 입력한 수까지 더하는 함수
        // sum(7) => 7+6+5+4+3+2+1 종료
        //재귀함수로 코드구현은 자바에서 권장x (무한반복 위험, 가독성 떨어짐)
        int sum =0;
        for (int i = 7; i > 0 ; i--) {
            sum+=i;
        }
        System.out.println(sum(10));

    }
}
