package com.kosmo;

import java.util.*; //util 패키지가 collections을 포함해서 컬렉션 패키지라고도 한다.

public class L39Map {
    public static void main(String[] args) {
//        Map: Collections 인터페이스로 구현된 타입이 아님, 대신 Set을 포함
        // Collections Framework
        // Collections (유용한 자료) Framework
        // Framework : 여러 라이브러리의 집합으로 새로운 규칙(*)을 생성, 유용, 어렵다.
        // 컬렉션 프레임워크가 무엇인가요?
        // 개발자를 위한 유용한 자료들의 집합

        // {key:value, key:value}
        //{name:"chaejungho", age:23}
        Map<String,Object> person = new HashMap<>();
        //HashSet Key 로 사용되고 있어서 이름이 HashMap
        person.put("name","정호");
        person.put("age",23);
        person.put("isMarried",false);
        System.out.println(person);//{isMarried=false, name=jjj, age=23}
        //Map 데이터도 순서(index)가 없다.
        person.put("name","jjj");
        System.out.println(person);//{isMarried=false, name=jjj, age=23}
        //Map 가 Set 타입이라 중복데이터를 허용하지 않는다

        Set keys = person.keySet(); // keySet() : key들만 반환
        System.out.println(keys); //[isMarried, name, age]

        System.out.println(person.get("isMarried"));
        System.out.println(person.get("age"));
        System.out.println(person.get("name"));
        PersonClas p = new PersonClas();
        //Map과 필드가 Key와 같은 인스턴트는 아주 유사한 데이터다.
        //자바는 유사하지만 구분해서 사용
        //Map과 class를 구분없이 사용하는 언어도 존재=> 자바스크립트
        System.out.println(p); //PersonClas{name='정호', isMarried=false, age=23}
        // Map과 필드가 Key와 같은 인스턴트는 아주 유사한 데아터이다.

        //자바는 유사하지만 구분해서 사용
        //Map은 생성자와 메소드를 포함하지 않는다
        Collection<Object> values = person.values();
        System.out.println(values);//[false, jjj, 23]
        //containsKey, containsValue

        //반복문으로 Map탐색
        //Key를 이용하는 방법
        Iterator<String> keysIt = person.keySet().iterator();
        System.out.println("////while//////");
        while (keysIt.hasNext()){
            String key = keysIt.next();
            Object value = person.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("//////for//////");
        for (String key : person.keySet()){
            Object value = person.get(key);

            System.out.println(key+"="+value);
        }
        System.out.println("//////엔트리 셋//////");
        //Entry // {[key,value],["name","jjj"],[key,value]}
        for (Map.Entry<String ,Object> entry : person.entrySet()){
//            System.out.println(entry);
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":::"+value);
        }
    }
}

class PersonClas{
    String name = "정호";
    boolean isMarried = false;
    int age = 23;

    @Override
    public String toString() {
        return "PersonClas{" +
                "name='" + name + '\'' +
                ", isMarried=" + isMarried +
                ", age=" + age +
                '}';
    }
}