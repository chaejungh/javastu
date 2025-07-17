package com.kosmo;
import java.util.*;
public class L38Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //Hash 알고리즘으로 구현된 Set
        //hashcode(데이터의 주소)로 같은 아이템을(중복)제거 HashSet
        //자료형 데이터는 equals 로 같은 데이터를 제거
        set.add(5);
        set.add(5);
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set); //[20, 5, 10, 30]
        //set은 인덱스가 없다
        //set.get(1) => 오류
        System.out.println(set.contains(20));
        System.out.println(set.remove(10)); //remove(index) : 없다

        //반복자
        Iterator<Integer> it = set.iterator(); //반복자 초기화 생성
        //it.pointer => * [20, 5, 10, 30]
        //it.hasNext() : 포인터 다음에 아이템이 있냐?
        //it.next() : 이동하고 아이템 반환
        System.out.println("///////////////이터레이터 while/////////////// ");

        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        System.out.println("///////////////향상된 for/////////////// ");
        for (int i : set){
            System.out.println(i);
        }
        //유사 반복자는 향상된 for를 지원하지 않아서 while을 사용해야합니다 => ResultSet
        // next() + hasNext() 합친 함수가 있어서 while문도 익혀둬야함.

        //add(o), remove(o),contains(o),size(), clear()모든요소 지우기, isEmpty(), iterator()반복자 생성,
        //없는 메서드: get(index), remove(index)


        Set<String> setStr = new HashSet<>();

        setStr.add("안녕"); //String.equals 가 구현되어 있어ㅓ서 Set 중복제거합니다.
        setStr.add("안녕"); // ==
        setStr.add(new String("안녕"));
        //"안녕" new String("안녕") 은 저장된 주소가 다름 (Set 은 자료형 데이터를 equals로 제거)
        setStr.add("잘가");
        setStr.add("식사");

        System.out.println(setStr);

        //Map
        //교양 LinkedList, LinkedHashSet, TreeSet
    }
}
