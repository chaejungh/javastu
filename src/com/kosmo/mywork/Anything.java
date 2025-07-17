package com.kosmo.mywork;
//
//요구사항:
//        •	Person 클래스: 생성자에서 "Person 생성" 출력
//	•	Employee 클래스: Person을 상속받고, 생성자에서 "Employee 생성" 출력
//	•	Manager 클래스: Employee를 상속받고, 생성자에서 "Manager 생성" 출력
//	•	main()에서 new Manager(); 호출 시 어떤 순서로 출력되는지 확인하세요.
//
//예상 흐름:
//
//Person 생성
//Employee 생성
//Manager 생성
//
//목표: 상속 관계에서 객체 생성 순서, super() 호출 흐름을 정확히 파악
class User{
    String id;
    User(String id){
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj==null) return false;
//        if (!(obj instanceof User))return false;
//        User other = (User) obj;
//
//        return this.id.equals(other.id);
//    }
}
public class Anything {
    public static void main(String[] args) {
        User user1 = new User("1");
        User user2 = new User("1");
        System.out.println(user1.id.equals(user2.id));
    }


}
