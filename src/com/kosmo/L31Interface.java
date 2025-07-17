package com.kosmo;
//새 날아다니는 새
interface Flyable{ //미완성 설계도에 able을 추가하는 경향이 있다.
    //interface: 완전한 미완성 설계도
    public abstract void fly();
    //1. 미완성 설계도기 때문에 메서드를 구현(바디,{}    )할 수 없다.
    //2. 필드를 작성할 수 없다. : 다중 구현시 우선순위를 정하기 어렵기때문
    //3. 무조건 퍼블릭 메서드만 작성가능 (자동으로 퍼블릭이 됨)
    int a=10; // 자동으로 클래스 멤버(static )로 구현됨.


//    public void fly(int direct){
//        System.out.println("fly");
//    };

}
interface Swimmable{
    void swim();
}
//인터페이스는 implements 로 구현을 강제함.(다중구현이 가능)
//다중구현 : 데이터 충돌(필드 -> 작성불가)이나 구현간의 충돌(메서드 -> 추상메서드)이 없으면 가능
//**다중상속  : 부모들이 같은 이름의 필드나 메서드를 가지고 있다면 누구의 것을 사용햘지 알 수 없다
class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class L31Interface {
    public static void main(String[] args) {
//        new Flyable();
        System.out.println(Flyable.a); //객체없이 혼자서 데이터로 존재(==static)
    }
}
