package com.kosmo.mywork;
import java.util.*;

abstract class ColAnimal{
    String name;
    int age;
    ColAnimal(String name, int age){
        this.name = name;
        this.age = age;
    };
    abstract void introduce();
}
interface ColWalkable{
    void Colwalk();
}
class ColDog extends ColAnimal implements ColWalkable{
    ColDog(String name,int age){
        super( name,  age);
    }
    void  introduce(){
        System.out.println("저는 "+name+"입니다. 나이는 "+age+"살 입니다.");
    }
    @Override
    public void Colwalk(){
        System.out.println("걷습니다");
    }
}
class ColFish extends ColAnimal{
    ColFish(String name, int age) {
        super(name, age);
    }

    void  introduce(){
        System.out.println("저는 "+name+"입니다. 나이는 "+age+"살 입니다.");
    }
}
class ColTiger extends ColAnimal implements ColWalkable{
    ColTiger(String name, int age){
        super(name, age);
    }
    void introduce(){
        System.out.println("저는 "+name+"입니다. 나이는 "+age+"살 입니다.");
    }
    @Override
   public void Colwalk(){
        System.out.println("걷습니다");
    }
}

public class CollAndOop {
    public static void main(String []args){
        ArrayList<ColAnimal> ca = new ArrayList<>();
       ca.add(new ColDog("뽀삐",3));
       ca.add(new ColFish("니모",1));
       ca.add(new ColTiger("타이거",5));

       for(ColAnimal ac:ca){
           ac.introduce();

           if(ac instanceof ColWalkable){
               ((ColWalkable) ac).Colwalk();
           }
       }
    }
}
