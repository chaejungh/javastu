package com.kosmo;
interface Carable{
    void drive();
}
class CarBmw{
    int y =10;
    //인스턴스 변수 (필드) : 객체가 존재하는 한 계속 존재합니다.
    void run(){
        int x =0; //메서드 내부의 변수
        // local 변수 : 메소드가 호출될때만 메모리로 존재
        //Carable 타입을 객체로 꼭 사용해야함
        Carable carable = new Carable() {
            @Override
            public void drive() {
                //익명클래스에서 로컬변수를 참조하면 로컬변수는 final로 바뀌어서
                // 변수가 다른데이터를 참조하지 못하게 한다.
                System.out.println("현재 위치는 : "+x+","+y);
//                x++;
            }
        };
        carable.drive();
    }
}
public class L33AnonymousLocalVar {
    public static void main(String[] args) {
        //익명클래스로 타입 제작시 로컬변수를 참조하는 경우, 주의해야할점


        //여기서 호출하는 데이터를 스택메모리에 보낸다.
    }
}
