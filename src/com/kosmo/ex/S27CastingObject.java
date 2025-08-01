package com.kosmo.ex;

public class S27CastingObject {
    public static void main(String[] args) {

    }
    /*

참조형 형변환 수업 정리: L28CastingObject.java

⸻

1. 자바의 자료형 구분

구분	예시	설명
기본(원시)형	int, float, char	값 자체를 저장, 연산 중심
참조(자료)형	String, 배열, 사용자 정의 클래스	객체의 주소(참조) 저장

면접 대비!!
자료형 데이터와 기본형 데이터의 차이
⸻

2. 자료형(객체형) 데이터 생성 방법

방식	예시
1. new 연산자	new Dog(), new int[3]
2. 배열 리터럴	{1,2,3} (배열만 가능)
3. 문자열 리터럴	"안녕"

String h = "안녕";
String h2 = "안녕";
String h3 = new String("안녕");
System.out.println(h == h2); // true (문자열 풀 상수 영역)
System.out.println(h == h3); // false (new로 새 객체 생성)

//문자열을 동등비교할수있나요?? 없다.~~~
//문자열 데이터의 저장방식

	•	문자열은 특수하게 + 연산 가능
	•	String은 char[] 배열 기반이므로 문자와도 결합 가능

⸻

3. 사용자 정의 클래스 예시

class Animal {
    String name;
    int birth;
}

class Dog extends Animal {
    String tail;
}

class Cat extends Animal { }

	•	Animal: 부모 클래스
	•	Dog, Cat: 자식 클래스 (상속)

⸻

4. 객체 생성 및 필드 설정

Animal ani = new Animal(); // 기본 Animal 객체
ani.name = "기린";
ani.birth = 1986;

Dog dog = new Dog(); // 자식 클래스 Dog
dog.name = "코에";
dog.birth = 2022;
dog.tail = "반토막";


⸻

5. 참조형 형변환

(1) Upcasting (자동 형변환)
Dog dog=new Dog();
Animal aniDog = new Dog();
Animal aniCat = new Cat();

	•	Dog → Animal : 자동 형변환
	•	aniDog는 Animal 타입이므로, name, birth는 접근 가능하지만 tail은 접근 불가
	*  부모가 형제를 부른다. (자연스러움,upcasting)

(2) Downcasting (강제 형변환) 부모 => 형제 자식들 중 한개가 되는것

Dog dog2 = (Dog) aniDog;

	•	다시 자식 타입으로 되돌리기: 강제 형변환(casting)
	•	aniDog가 실제로 Dog 타입이라면 안전

(3) 잘못된 다운캐스팅 (컴파일은 가능, 실행 시 오류)

Cat cat = (Cat) aniDog; // 런타임 오류 발생 (ClassCastException)

	•	aniDog는 실제로 Dog 객체이므로 Cat으로 형변환 불가
	•	instanceof 검사로 방지 가능

if (aniDog instanceof Cat) {
    Cat cat2 = (Cat) aniDog;
}


⸻

정리 요약

개념	설명
업캐스팅	자식 → 부모, 자동 형변환
다운캐스팅	부모 → 자식, 강제 형변환 필요
형변환 조건	실제 객체 타입이 변환하려는 타입과 일치해야 함
오류 방지	instanceof로 타입 체크 필요
참조형 형변환과 기본형 형변환의 차이	참조형은 “주소”를 공유, 기본형은 “값”만 변환


⸻

자바 참조형 형변환 문제 (10문제)

⸻

1. 다음 중 업캐스팅이 일어나는 문장은?

A. Dog dog = new Animal();
B. Animal animal = new Dog();
C. Dog dog = (Dog) new Animal();
D. Object obj = (Object) "Hello";
B
⸻

2. 다운캐스팅이 필요한 경우는? //정답 없음

A. Animal a = new Dog();
B. Dog d = new Dog();
C. Animal a =new Dog();  Dog d = (Dog) new Animal();
D. Object obj = new String("hi");
C
⸻

3. 다음 코드에서 런타임 오류가 발생하는 문장은?

Animal a = new Dog();
Cat c = (Cat) a;

Cat c = (Cat) a;
⸻

4. 다음 중 컴파일은 되지만 **런타임 오류(ClassCastException)**가 발생하는 경우는?

A. Object obj = new Dog();
B. Dog d = (Dog) obj;
C. Cat c = (Cat) new Dog();
D. String s = (String) "Hello";
C XX  B
⸻

5. 다음 중 형변환이 필요 없는 경우는?

A. Dog dog = new Dog();
B. Animal animal = new Dog();
C. Object obj = new Animal();
D. 모두 형변환 없이 가능
A
⸻

6. 클래스 상속 구조에서 자식 타입을 부모 타입으로 변환하는 것을 무엇이라 하는가?

A. 다운캐스팅
B. 업캐스팅
C. 추상화
D. 다형성
B
⸻

7. 다음 코드는 어떻게 실행되나요?

Animal a = new Dog();
Dog d = (Dog) a;

A. 에러 발생
B. 컴파일 오류
C. 런타임 오류
D. 정상 실행
D
⸻

8. 다음 중 instanceof 연산자의 역할은?

A. 클래스의 상속을 확인한다
B. 객체가 null인지 확인한다
C. 객체가 특정 클래스의 인스턴스인지 확인한다
D. 타입을 자동 변환해 준다
C
⸻

9. 다음 코드에서 출력 결과는?

Animal a = new Dog();
System.out.println(a instanceof Dog);

A. true
B. false
C. 컴파일 오류
D. 런타임 오류
A
⸻

10. 다음 중 정적(static) 내부 클래스는 어떤 특징을 갖는가?

A. 외부 클래스의 인스턴스 없이 생성 가능하다
B. 항상 외부 클래스의 인스턴스를 필요로 한다
C. 외부 클래스의 인스턴스 변수에 접근할 수 있다
D. 반드시 private으로 선언해야 한다

A
⸻

좋습니다! 요청하신 대로 Inner 클래스와 instanceof 연산자 관련 내용은 제외하고,
지금까지 수업한 기반 (Object, String, 사용자 정의 클래스 Animal, Dog, Cat, 업캐스팅/다운캐스팅, 기본형 형변환 포함)만으로 풀 수 있는
약간 어려운 자료형 형변환 문제 10개를 정리해드립니다.

⸻

✅ 자바 자료형 형변환 — 심화 문제 (Inner 클래스 & instanceof 제외, 10문제)

⸻

1. 다음 코드 실행 시 출력 결과는?

Object obj = "기린";
String name = (String) obj;
System.out.println(name.length());

A. 2
B. 컴파일 오류
C. 런타임 오류
D. 3
A
⸻

2. 다음 중 업캐스팅으로 올바른 코드는?

A. Dog d = new Animal(); //컴파일 오류
B. Animal a = new Dog(); //업캐스팅
C. Cat c = (Cat) new Animal(); // 런타임 오류
D. Animal a = (Animal) new Object(); // 런타임오류
B
⸻

3. 다음 코드에 대한 설명으로 옳은 것은?

Animal a = new Animal();
Dog d = (Dog) a;

A. 업캐스팅이므로 오류 없음
B. 다운캐스팅이며 컴파일 오류
C. 다운캐스팅이며 컴파일은 되지만 런타임 오류 발생
D. new 연산자가 없으므로 오류 발생
C
⸻

4. 다음 코드 중 변수 a를 통해 호출 가능한 메서드는?

class Animal {
    void eat() {}
}

class Dog extends Animal {
    void bark() {}
}

Animal a = new Dog();

A. a.bark();
B. a.eat();
C. a.run();
D. 모두 가능
B
⸻

5. 다음 코드에서 name의 출력 결과는?

Animal a = new Dog();
a.name = "코에";
System.out.println(a.name);

A. null
B. 코에
C. 컴파일 오류
D. Dog 클래스에 name이 없으므로 오류
B
⸻

6. 다음 중 강제 형변환이 필요한 문장은?

A. int i = 100; long l = i;
B. long l = 10000000000L; int i = (int) l;
C. double d = 10; int i = d; //컴파일 오류지만 강제 형변환이 필요
D. String s = (String) "안녕";
B,C
⸻
//처음부터 문자열인 경우!!
7. 다음 중 Object 타입으로 선언된 변수를 String으로 안전하게 캐스팅할 수 있는 문장은?

A. Object obj = "hello"; String s = (String) obj;
B. Object obj = new Animal(); String s = (String) obj;
C. Object obj = 42; String s = (String) obj;
D. Object obj = null; String s = (String) obj;
A
⸻

8. 다음 코드의 결과는?
1 0010 1100 = 256+32+8+4
int i = 300;
byte b = (byte) i;
System.out.println(b);
300-127=173
173-127=46
A. 300
B. -56
C. 컴파일 오류
D. 예외 발생
44
⸻

9. 다음 코드에서 d가 정상적으로 출력되려면 어떤 조건이 필요한가?

Animal a = getAnimal();
Dog d = (Dog) a;
System.out.println(d.tail);

A. a는 Object여야 한다
B. a는 Dog 인스턴스여야 한다
C. a는 Animal이면 된다
D. 어떤 타입이든 상관 없다
B
⸻

10. 다음 중 자료형 형변환이 전혀 발생하지 않는 문장은?

A. Dog d = new Dog();
B. Animal a = new Dog();
C. Object o="hi"; String s = (String) o;
D. int i = (int) 3.14;
A
⸻

✅ 1. 자바 기본형 형변환 기초 문제 (10문제)

번호	정답
1	B,D
2	C
3	(Cat) a
4	C
5	D
6	B
7	D
8	C
9	A
10	A


⸻

✅ 2. 자바 참조형 형변환 (Inner/instanceof 제외, 심화 문제 10문제)

번호	정답
1	A
2	B
3	C
4	B
5	B
6	B
7	A
8	B
9	B


⸻



*/
}

