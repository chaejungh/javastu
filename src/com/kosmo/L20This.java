package com.kosmo;
class Stu{ //학교 어플에서 학생 데이터 관리
    String id="A2401231";
    String name = "chae";
    int birth = 2003;

}
class Stu2{
    String id ="A230003333";
    String name = "chaee";
    int birth = 2008;
}
class Stu3{
    String id ;
    String name;
    int birth;

    Stu3( String id, String name, int birth){
        this.id = id;
        this.name = name;
        this.birth = birth;
        System.out.println(this.toString());

    }
    public String toString(){
        return "학생의 이름은:"+this.name+", 학번은:"+this.id+", 탄생일은:"+this.birth;
    }

}
public class L20This {
    public static void main(String[]args){
        //학생을 저장 관리
        Stu c = new Stu();//Stu 로 만든 자료데이터
        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(c.birth);
        c.name ="chhh";


        Stu2 a = new Stu2();
        System.out.println(a.name);
        System.out.println(a.id);
        System.out.println(a.birth);
        Stu3 abc = new Stu3("2023","jung",2003);
//        System.out.println(abc);
    }
}
