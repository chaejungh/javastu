package com.kosmo;

public class L41StringBuffer {
    public static void main(String[] args) {
        //Array vs List
        //String vs StringBuilder (StringBuffer)
        //String이 불변데이터기 때문에 StringBuffer 나옴
        //가변길이의 문자열은 StringBuffer를 사용해야합니다
        //buffer : 임시저장공간
        StringBuffer sb = new StringBuffer("hi"); // 기본적으로 16개의 임시저장공간를 가짐
        sb.append("my name is jh."); // append : 문자열 += 연산
        sb.append(" nice to meet you.");
        System.out.println(sb);

        String s ="A";//"A"
        s+="B";//"A","B","AB"
        s+="C";//"A", "B", "AB","ABC"

        sb = new StringBuffer(100);//{'A','\0'......}16 => new StringBuffer(100) 시작 크기를 100으로 만듦
        sb.append("A");//"A"
        sb.append("B");//"AB"
        sb.append("C");//"ABC"

        //insert(3,""  ) : 특정위치에 문자열추가
        //delete(1,4) : 삭제
        //replace(0,3,"Hello") : 대체
        //String과 다르게 기존 문자열에서 삭제 및 수정 가능
        System.out.println(sb);
        sb.reverse();;
        System.out.println(sb);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("A");
        strBuilder.append("B");
        strBuilder.append("C");
        System.out.println(strBuilder);
        strBuilder.reverse();
        System.out.println(strBuilder);
        //StringBuilder vs StringBuffer 거의 비슷
        //StringBuffer 멀티스레드 환경에서 안전(Vector) : 멀티스레드 배우고 다시 등장할 예정


        long ss = System.nanoTime();
        int sum = 1+1;
        long end = System.nanoTime();
        System.out.println(ss);
        System.out.println(end);
        System.out.println(end-ss);// 1+1이 걸린시간

        ss =System.nanoTime();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str+=i;
        }//"0,1,2,3,4~~~"
        end = System.nanoTime();
        long aa=end -ss;
        System.out.println("문자열 더하기 연산시간: "+(end -ss));

        ss = System.nanoTime();
        strBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            strBuilder.append(i);
        }
//        System.out.println(strBuilder);
        end = System.nanoTime();
        long bb =end-ss;
        System.out.println("스트링빌더의 더하기 연산시간: "+(end-ss));
        System.out.println("String과 StringBuilder의 연산시간 차이: "+(aa/bb)+"배");
    }
}
