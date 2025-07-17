

//여러 명의 고객이 온라인으로 여러 상품을 구매했습니다.
//        각 고객의 이름, 주문 상품 이름, 수량을 입력받아
//        아래 요구사항을 모두 만족하는 프로그램을 작성하세요.
//
//        [요구사항]
//        전체 고객 수(n)을 입력받는다.0
//
//        각 고객의 주문 내역(고객명, 상품명, 수량)을 입력받는다.
//        (고객 한 명이 여러 번 주문할 수 있음. 예: kim, 사과, 2 → kim, 바나나, 1)
//
//        **모든 고객의 총 주문 수량(모든 상품 합)**을 출력한다.0
//
//        고객별로 총 주문 수량을 출력한다. (고객 이름 오름차순)Arrays.sort()<<<이름 오름차순
//
//        상품별 총 판매 수량을 출력한다. (상품 이름 오름차순)
//
//        최고 주문 고객(여러 명 가능)의 이름과 주문 총량을 출력한다.
//
//        특정 상품명을 입력하면, 그 상품을 주문한 고객의 이름(중복 없이)과 총 주문 수량을 출력한다.
//        (예: 상품명 '사과' 입력 → 사과를 주문한 고객: kim, park ... / 총 주문량: XX)

package com.kosmo.mywork;
import java.util.*;
public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Scanner 만들기
        System.out.print("전체 고객 수: ");
        int n = scan.nextInt();
        int i =0;
       HashMap<String,Integer> customer_Map = new HashMap<>();
       HashMap<String,Integer> obj_Map = new HashMap<>();
       while (i<n){
           String a = scan.next();
           while (true){
               System.out.print("상품명 입력");
               String aa = scan.next();

           }
//           customer_Map.put(a);
       }
    }
}
