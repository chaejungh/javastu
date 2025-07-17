package com.kosmo;
class Super{
    int a;
    Super(int a){
        this.a = a;
    }
    public String toString(){
        return "Super { a: "+this.a+"}";
    }
}
class This extends Super{
//    This(){
//        super(10)  ;//Super(10)
//    }
    This(int a){
        super(a); // new Super(10);
        //자식 객체가 생성될 때 부모도 객체로 만들어 진다
        //부모의 생성자 규칙이 강제되어 있다면 자식이 부모의 생성자를 호출해야합니다.
        this.a = a;
    }
    @Override
    public String toString(){
        return "This { a: "+this.a+"}";
    }
}
public class L23SuperConstructor {
    public static void main(String[]args){
        Super s = new Super(3);
        This t = new This(5);
        System.out.println(s);
        System.out.println(t);
    }
}
