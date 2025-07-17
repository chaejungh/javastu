package com.kosmo.mywork;

abstract class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    abstract void introduce();
}
class Lion extends Animal{

    public Lion(String name, int age) {
        super(name, age);
    }

    void introduce(){
        System.out.println("저는 사자입니다. 이름은 "+name+", 나이는 "+age+"살입니다." );
    }
}
class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    void introduce(){
        System.out.println("저는 코끼리입니다. 이름은 "+name+", 나이는 "+age+"살입니다." );
    }

}
public class Solution2 {
    public static void main(String[]args){
      Animal[] zoo = new Animal[2];
      Lion lion = new Lion("심바",5);
      Elephant ele = new Elephant("엘라", 10);

      zoo[0] = lion;
      zoo[1]  = ele;

      for (int i =0;i<zoo.length;i++){
          zoo[i].introduce();
      }

    }
}
