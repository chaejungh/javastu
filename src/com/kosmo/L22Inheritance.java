package com.kosmo;
class Parent{
    String name = "부모";
    String birth ="1986-05-25";//1986-05-25
    public String toString(){
        return "Parent{ name:"+this.name+"birth: "+this.birth;
    }
}
class  Child extends Parent{
    String name ="자식";

    @Override
    public String toString() {
        return "Child{" +
                "name='" + this.name + '\'' +
                ", birth='" + this.birth + '\'' +
                '}';
    }
}
public class L22Inheritance {
    public static void main(String[]args){
        Parent parent = new Parent();
        System.out.println(parent);
        Child c = new Child();
        System.out.println(c);

    }
}
