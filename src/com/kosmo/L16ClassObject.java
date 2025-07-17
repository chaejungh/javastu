package com.kosmo;

class A{//전역: global scope: 필드와 메소드정의 외에 다른 것을 할 수 없다
//필드 선언법: 전역에 선언 가능

//접근지정자 : public(어디서든 접근 가능)
// =>default : 같은 패키지내에서 가능
// protected : 상속관계에서 접근 가능
// private(클래스 내부에서만 쓸거야)
//메서드 : 객체
}
class Calc{
    public double plus(double a, double b, double c){
        return a+b+c;
    }

}
public class L16ClassObject {
    public static void main(String[] args){
Calc calc = new Calc();
        System.out.println(calc.plus(1.2,2.4,3.3));






        //new 연산자로 생성되는 객체는 JVM에 heap 메모리 영역에ㅔ 저장
        //heap메모리 영역에 존재하는 GarbageCollector(쓰레기 수집가)가
        //사용하지 않는 객체를 정리
    }
}
