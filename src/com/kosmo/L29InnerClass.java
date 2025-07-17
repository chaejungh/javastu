package com.kosmo;

class Out{
    In in =new In();
    int a =10;
    //new Out() {a:10, in: new Int()}
    static int b =20;
    class In{// inner(nested) class: 내부클래스
        //내부 클래스: class 내부에서만 사용하려고 만든 자료형
        //Out. java => Out.class
        //    => Out$in.class
        //Out.class
        //Out$in.class
        int score;
        String num;
    }
    //Out.A
    static class A{}//정적 내부 클래스 : 밖의 클래스의 이름만 가져다 쓰는 독립적 class
}
public class L29InnerClass {
    public static void main(String[] args) {
//        In in = new In(); // 내부 클래스는 독립적으로 존재할수없고 외부클래스에 소속되어있음
        Out out = new Out();
        Out.In in =out.new In(); //이렇게 사용하는 목적이 아니다.(작성이 불편)
        Out.In in2 = new Out().new In();




        System.out.println("이너클래스 시작");
        System.out.println(new Out().a);
        System.out.println(Out.b);//static 은 독립적이라 객체생성없이 데이터로 존재

        Out.A a = new Out.A();
    }
}
