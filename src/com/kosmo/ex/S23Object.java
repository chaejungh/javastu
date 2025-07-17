package com.kosmo.ex;
class AA{
    String name;
    void call(){
        System.out.println("AA입니다.");
    }
}
class BB extends AA{
    String name;//제정의
//    @어노테이션 : ==주석 >>컴파일될때 실행(main이 실행될때 실행)
//    @Override// 부모에 같은 함수 call()이 있는지 검사하는 어노테이션
//    부모의 메소드를 자식이ㅣ 재정의하는 것을 오버라이딩, 오버라이드라 부른다
//    void call(){
//        System.out.println("BB입니다.");
//    }

    @Override
    public String toString() {
        return super.toString()+"\n BB{name:"+name+"}";//타입 @hashcode
    }

    void call(int a){
        //오버로드, 오버로딩 : 이름이 같은 함수가 매개변수만 다르게 존재하는 것
    }
}
class 오브젝{
    //상속받지않았다 => 재정의할 것이 없음
}
class A {
    A() {
        System.out.println("A 생성자");
    }
}

class B extends A {
    B() {
        System.out.println("B 생성자");
    }
}


public class S23Object {
    public static void main(String[] args) {
        BB b = new BB();
        b.name = "BB군";
        System.out.println(b);
        new B();

    }
}
/*

📘 자바 상속과 super() 생성자 호출 정리

1. 클래스 구조 및 생성자 정의

class 슈퍼 {
    int a;

    슈퍼(int a) {
        this.a = a;
    }
}

	•	슈퍼 클래스에는 기본 생성자가 정의되어 있지 않고, 매개변수가 있는 생성자만 존재합니다.
	•	이는 자식 클래스가 반드시 명시적으로 해당 생성자를 호출해야 함을 의미합니다.

class 디스 extends 슈퍼 {
    디스(int a) {
        super(a);  // 부모 생성자 호출 필수
    }
}

	•	디스 클래스는 슈퍼 클래스를 상속받으며, 부모 생성자가 매개변수를 요구하므로 자식 생성자에서 반드시 super(값)으로 호출해야 합니다.
	•	호출이 없을 경우, 컴파일 에러가 발생합니다. 자바는 생성자의 첫 줄에서 부모 생성자를 자동으로 호출하려 시도하지만, 기본 생성자가 없으므로 명시적으로 작성해야 합니다.

⸻

2. 생성자 호출 흐름

public class L23SuperConstructor {
    public static void main(String[] args) {
        슈퍼 s = new 슈퍼(10); // 직접 부모 클래스 객체 생성
    }
}

	•	위의 main 메서드는 자식 클래스가 아닌 슈퍼 클래스의 객체만 생성합니다.
	•	따라서 디스 클래스 생성자나 상속 구조는 사용되지 않지만, 수업 목적상 부모-자식 생성자 관계 및 호출 규칙을 설명하기 위한 예제로 사용됩니다.

⸻

🔍 핵심 개념 요약

항목	설명
super(값)	부모 클래스의 생성자를 호출하는 키워드
호출 시점	자식 클래스 생성자의 첫 줄에서 호출되어야 함
호출 이유	부모 클래스에 기본 생성자가 없을 경우 자식 클래스는 직접 부모 생성자를 호출해야 함
객체 생성 순서	자식 객체 생성 시, 먼저 부모 객체가 생성되어야 함


⸻

📌 주요 학습 포인트
	•	자바에서 클래스 간 상속 시, 부모 객체는 항상 먼저 생성되어야 함.
	•	부모 클래스에 기본 생성자가 정의되지 않은 경우, 자식 클래스는 명시적으로 super(...)를 통해 생성자 호출을 수행해야 함.
	•	생성자 호출 흐름은 자식 → 부모 → 필드 초기화 순으로 진행됨.

⸻*/


