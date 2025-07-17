package com.kosmo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@FunctionalInterface //추상메서드가 한개 뿐이야 (람다식 사용가능)
interface Testable{
    void test();
}
public class L32AnonymousClass {
    //  Testable 를 사용하기 위해 보통 내부클래스를 작성
    class Test implements Testable {
        @Override
        public void test() {
            System.out.println("testing");
        }
    }
    //컴파일러가 몰래
    /*
    class 1 implements Testable{
     @Override
                public void test() {
                    System.out.println("Testing");
                }



    }
     */

    void run() {
        Test t = new Test();
        //L32AnonymousClass$Test
        t.test();
    }
//
//      매번 이렇게 쓰기 귀찮아서 익명 클래스를 만듦
    void run2() {
        // Testable을 구현하지 않고 객체로 바로 만들고 싶어!!
        // Testable을 구현한 객체를 한번만 쓰고 다시는 사용하지 않을 거야
        // 그런데 Test 클래스를 만들필요가 있을까?
        Testable tt = new Testable() {
            //L32AnonymousClass$이름없는 클래스
            @Override
            public void test() {
                System.out.println("Testing");
            }
        };
        //그럼 내(자바)가 그럼 바로 인터ㅓ페이스를 객체로 만들어줄게
        //대신 추상메서드를 객체 만들며 바로 구현해


        //익명 클래스 개념
        //추상메서드를 포함하는 인터페이스나 추상클래스를 객체로 만들 수 없는데
        //.개발자 편의를 위해 추상메서드를 구현하면서 객체를 생성하는 문법 지원
        //이때 컴파일러가 (개발자가)구현한 코드를 익명 클래스에 반영함








        tt.test();

    }


    void run3(){
        Testable ttt = new Testable(){
            @Override
            public void test() {
            }
        };
        //람다식 () -> {}  = test(){}
        Testable t = ()->{
            System.out.println("lamda");

        };
        t.test();
    }
    static class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //버튼을 누르면 ~`해라
        }
    }
    public static void main (String[]args){
        L32AnonymousClass a = new L32AnonymousClass();
        a.run3();
        Testable t=()-> System.out.println("main Testable");
        ;
        t.test();

    }
}