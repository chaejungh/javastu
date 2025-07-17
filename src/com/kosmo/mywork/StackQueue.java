package com.kosmo.mywork;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyEntity {}

@MyEntity
class Student {
    String name;
    int age;
    double score;
}

public class StackQueue {
    public static void main(String[] args) {
        Class<?> clazz = Student.class;
        if (clazz.isAnnotationPresent(MyEntity.class)) {
            System.out.println("클래스명: " + clazz.getName());
            for (Field f : clazz.getDeclaredFields()) {
                System.out.println("필드명: " + f.getName() + ", 타입: " + f.getType().getSimpleName());
            }
        }else {
            System.out.println("어노테이션 없음");
        }
    }
}