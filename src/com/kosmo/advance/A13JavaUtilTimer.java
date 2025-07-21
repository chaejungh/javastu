package com.kosmo.advance;

import java.time.LocalDateTime;
import java.util.Timer;
import java.time.LocalTime;
import java.util.TimerTask;

public class A13JavaUtilTimer {
    public static void main(String[] args) {
        //1초마다 현재 시간을 콘솔에 출력하는 어플
        Thread t = new Thread(() -> {
            while (true){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e ){
                    System.out.println("Thread interrupted error");
                }
                LocalTime now = LocalTime.now();
//                System.out.println(now);
            }
        });
        t.start();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(LocalDateTime.now());
            }
        },0,1000);
       //delay 기간동안 쉬었다가 period 마다 실행(start 필요없음)

        System.out.println("내가 실행되면 무한반복은 스레드 생성후 실행");

        //Swing의 스레드와 충돌 위험이 있어서 중복해서 사용하면 안됨.
    }
}
