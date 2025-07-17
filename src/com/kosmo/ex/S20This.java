package com.kosmo.ex;
class Animal{ //클래스는 파스칼 규칙
    String id;
    String name;
    String species;
    int birth;
    //변수명 메소드명 필드명 : 낙타 표기법(약속)
    //생성자는 약속된 형태가 존재 : 인텔리제이에서 자동완성 제공 -> 마우스 오른쪽 => 생성 => 생성자
    Animal( String id, String name, String species, int birth){
        this.id =id;
        this.name =name;
        this.species =species;
        this.birth =birth;
        System.out.println(toString());
    }
    //오버라이딩: 기존의 toString을 덮어서 다른걸로 바꾼다.
    public String toString(){
        return "관리번호: "+id+", 종: "+species+", 이름: "+name+", 탄생년도: "+birth;
    }


}
public class S20This {
    public static void main(String[] args) {
        Animal bear = new Animal("0","검둥이","곰",2020);
        Animal rabbit = new Animal("1","하양이","토끼",2022);
        Animal crane = new Animal("2","빨간머리","두루미",2018);
        //동물원 관리 어플
        //동물 자료 관리 하는 타입 만들어주세요
        //동물의 자료로 관리번호,이름,탄생년도
        //곰(검둥이), 토끼(하양이), 두루미(빨간머리) 1마리씩 관리할예정
        //만들어진 정보를 객체를 생성할때 바로 볼수있게해주세요
    }
}
