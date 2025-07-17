package com.kosmo.mywork;
 class Animal2{
    String sound;
    Animal2(String sound){
        this.sound = sound;
    }
    void sound(){
        System.out.println(this.sound);
    }
}
class Cat extends Animal2{

    Cat(String sound) {
        super(sound);
    }

    @Override
    void sound() {
        super.sound();
    }

}
class Dog extends Animal2{

    Dog(String sound){
        super(sound);
    }
    @Override
    void sound() {
        super.sound();
    }


}
class Bird extends Animal2{

    Bird(String sound){
        super(sound);
    }
    @Override
    void sound( ) {
        super.sound();
//        System.out.println("??");
    }
}
public class SolUpcasting {



    public static void main(String[]args){
//
        Animal2 a = new Animal2("12");
     Dog b = (Dog)a;
        Animal2[] animals = new Animal2[3];
//        Cat cat = new Cat("야옹");
//        Dog dog = new Dog("멍멍");
//        Bird bird = new Bird("짹짹");
        animals[0] = new Cat("야옹");
        animals[1] = new Dog("멍멍");
        animals[2] = new Bird("짹짹");
        for (int i =0;i<animals.length;i++){
            animals[i].sound();
        }

    }
}
