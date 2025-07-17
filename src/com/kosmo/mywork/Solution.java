package com.kosmo.mywork;

class Car{
    String model = "Sonata";
    int speed=80;
    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;

    }
    void drive(){
        System.out.println(model + " is driving at "+speed+"km/h");
    }
    void stop(){
        System.out.println("The "+model+" has stopped");
    }
}
public class Solution{
    public static void main(String[] args){

        Car car = new Car("Moring",90);
          car.stop();

          car.drive();
    }
}