package com.kosmo.mywork;
import java.util.Scanner;
public class LRU {
    static String[] st = new String[4]; //기본 배열
    static String[] qu= new String[4]; //LRU 구현 가장 오래 사용되지 않는 값 삭제

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("인덱스 값(정수형), 입력 값(문자열)을 입력하시오<종료를 원하면 6을 입력하세요>: ");//K,V 값 입력
        int K=scan.nextInt();
        String V=scan.nextLine();
        if(K==6)break;

        System.out.print("put,get,remove: ");//어떤 행동을 취할 건지 입력받고 해당하는 메서드 실행
        String ch = scan.nextLine();

        switch (ch) {// 입력 받은 메소드 실행
            case "put" -> put(K, V);
            case "get" -> get(K);
            case "remove" -> remove(K);
        }
        }
        System.out.print("LRU: ");
        for (int i = 0; i < qu.length; i++) { // qu 배열 출력
            System.out.print(qu[i]+" ");
            if(i==3) System.out.println("");
        System.out.println("기본 배열:");
        }for (int i = 0; i < st.length; i++) { //st 배열 출력
            System.out.print(st[i]+" ");
        }

    }
    public static void put(int K, String V){
       if(st[K] != null){// 입력 받은 K번째 인덱스에 값이 존재할경우 기존 값을 삭제하고 삽입함 이때 가장 오래 사용되지 않은 항목은 삭제
           System.out.println("K번째 인덱스에 값이 존재함으로 입력한 값으로 대체됩니다");
           for (int i = qu.length - 1; i > 0; i--) {
               qu[i] = qu[i - 1];
           }
           qu[0] = V;
           return;
       }
        st[K]=V;
        for (int i = qu.length - 1; i > 0; i--) {
            qu[i] = qu[i - 1];
        }
        qu[0] = V;


        System.out.println("해당 인덱스에 값이 입력되었습니다");
    }

    public static void get(int K){
        System.out.println(st[K]);
        for (int i = qu.length - 1; i > 0; i--) {
            qu[i] = qu[i - 1];
        }
    }

    public static void remove(int K){
        st[K]=null;
        System.out.println("K 번째 인덱스가 삭제되었습니다");
        for (int i = qu.length - 1; i > 0; i--) {
            qu[i] = qu[i - 1];
        }
    }
}
