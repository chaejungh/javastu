package com.kosmo.mywork;

import static java.nio.file.Files.walk;

abstract class Animal3{
    String name;
    int age;
    Animal3(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void introduce();
}

interface Walkable{
    void walk();


}
class Lionn extends Animal3 implements Walkable {
    Lionn(String name, int age){
        super(name,age);
    }
    @Override
    void introduce(){
        System.out.println("제 이름은 "+name+" 나이는 "+age+"살 입니다." );
    }
    public void walk(){
        System.out.println("사자가 걷습니다.");
    }


}

class Penguin extends Animal3 implements Walkable{
    Penguin(String name, int age){
        super(name, age);
    }

    @Override
    void introduce() {
        System.out.println("제 이름은 "+name+" 나이는 "+age+"살 입니다." );
    }
    public void walk(){
        System.out.println("펭귄이 뒤뚱뒤뚱 걷습니다.");
    }
}

public class SolAbstract {
    public static void main(String[]args){
        Animal3[] zoo = new Animal3[2];
        zoo[0] = new Lionn("갈기",4);
        zoo[1] = new Penguin("펭구",3);
        for(Animal3 animal:zoo) {
            animal.introduce();

            if (animal instanceof Animal3) {
                ((Walkable) animal).walk();
            }
        }
    }
}
