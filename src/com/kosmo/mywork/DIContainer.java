package com.kosmo.mywork;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DIContainer {
    public static void main(String[] args){
        String classes[]={"com.kosmo.mywork.Car>java.lang.Object","com.kosmo.mywork.Car2>Component>java.lang.Object","com.kosmo.mywork.Car3>java.lang.Object"};//class 스캔을 해서 클래스 정보를 받는다
        for (int i = 0; i <classes.length ; i++) {
            Boolean b = classes[i].contains("Component");//반복문으로 Component가 포함된 클래스를 판별
            if (b){}//Component가 포함됐다면....
        }

        Map containers=new HashMap();
        containers.put("com.kosmo.mywork.Car2",new com.kosmo.mywork.Car2());//객체생성

        Map fields=new HashMap();//필드 스캔 Autowired된 필드만 객체 주입
        fields.put("com.ckm.Boat.car","com.ckm.Car");
        fields.put("com.ckm.Boat2.car>Autowired","com.ckm.Car2");
        for (int i = 0; i <classes.length ; i++) {
            Boolean b = classes[i].contains("Autowired");//반복문으로 Autowired가 포함된 클래스를 판별
            if(b){}
        }

    }
}

class Car2{
    Car car2;
}


