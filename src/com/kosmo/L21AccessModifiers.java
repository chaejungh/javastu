package com.kosmo;
//protected
class Access{
    //접근 지정자: 필드나 함수의 접근 권한을 지정 => 캡슐화
    private int a =10;// class 내부에서 접근 가능
    public int b = 20; //누구나 다 접근 가능

    int c = 30;//default(기본) " 패키지가 같은 클래스는 접근 가능
    protected int d = 20;//상속관계는 접근 가능

    //이름이 같은데 여러개 있는 것=> 오버라이딩(Override/ing)
    Access(){}
    Access(int a,int b, int c){
        this.a =a;
        this.b =b;
        this.c =c;

        System.out.println(toString());
    }
    public String toString(){
        return "a:"+a+", b:"+b+", c:"+c;
    }
}

public class L21AccessModifiers {
    private int a =10;
    public int b = 20;
    int c = 30;
    public L21AccessModifiers(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "L21AccessModifiers{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[]args){
        L21AccessModifiers a =new L21AccessModifiers(1000);
        a.a=999;
        a.b=9999;
        a.c=99999;
        System.out.println(a);
    }
}
