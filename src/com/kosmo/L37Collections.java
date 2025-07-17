package com.kosmo;

import java.lang.reflect.Array;
//java.util : 개발자에게 유용한 도구(라이브러리, class)를 제공
import java.util.*;

import static java.util.Collections.sort;

public class L37Collections {
    public static void main(String[] args) {
            int arr[] = new int[4];
            System.out.println(Arrays.toString(arr));
//        arr[4]=1; {0,0,0,0,1 } 기대중 => 오류
            //Array 처음 만들어진 길이 고정
            //배열: 순서/길이가 있는 데이터
            List li = new ArrayList();
            //List : 길이가 변경되는 배열
            li.add(10);
            li.add(10.0);
            li.add(10.0f);
            li.add(10L);
            li.add("10");
            System.out.println(li);
            System.out.println(li.get(3)); //list의 인덱스 참조, arr[3]
//        System.out.println(li.get(4)); //Array 처럼 없는 것은 참조 불가능
            System.out.println("길이: " + li.size());
            System.out.println(li.remove("10"));//데이터를 찾아지움 (실패가능)
            System.out.println(li);
            System.out.println(li.remove(1)); //데
            System.out.println(li);
            System.out.println(li.contains(10.0f));
            System.out.println(li.contains(11.0));
            //(double)10 : 수(기본형)을 더블에 맞게 변경
            //(Double)10 : 객체(자료ㅕㅇ)의 타입이 Double이 있냐

            //Array 사용 이유: 메모리가 절약됨(고급언어일수록 Array가 없는경우가 존재함)

            List<Integer> liInt = new ArrayList<>();
            liInt.add(10);
            liInt.add(99);
            liInt.add(20);
            liInt.add(-100);
            System.out.println(liInt);
            liInt.sort(null);//오름차순
            System.out.println(liInt);
            liInt.sort(Comparator.reverseOrder());
            System.out.println(liInt);
            List<String> liStr = new ArrayList<>();
            liStr.add("Banana");
            liStr.add("Kiwi");
            liStr.add("Lemon");
            liStr.add("a"); ///대문자가 앞에 소문자가 뒤에 있음
            liStr.add("A");
            System.out.println(liStr);
            liStr.sort(null);
            System.out.println(liStr);
            //contains, sort, remove, add : List의 유용한 함수


            for (String s : liStr) {//index를 알수없다
                System.out.println(s);
            }
            System.out.println("향상된 for 반복문(iterator) 종료");
            for (String s : liStr) {//index를 알수없다
                System.out.println(s);
            }
            System.out.println("향상된 for 반복문은 iterator을 초기화하고 다시 사용");
            Iterator<String> it = liStr.iterator();
            while (it.hasNext()) {

                String s = it.next();
                System.out.println(s);
            }
            System.out.println("while로 이터레이터(반복자) 호출");

//        it =liStr.iterator();  초기화해서 다시 배열의 처음을 가르켜야함
            while (it.hasNext()) {// 결과: 아무것도 안뜸/ 반복자는 끝으로 이동하면 다시 사용할 수 없음

                String s = it.next();
                System.out.println(s);
            }
        }
    }

