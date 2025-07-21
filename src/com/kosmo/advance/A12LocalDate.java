package com.kosmo.advance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class A12LocalDate {
    public static void main(String[] args) {
        //최초의 시간 객체 java.util.Date 가 사용하기 불편해서
        //java 8 에서 java.time.* 패키지 도입
        //LocalDate(날짜), LocalDateTime(날짜+시간), LocalTime(시간,, 날짜 무시)
//        Date now = new Date();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //ISO-Date 표기법 : 문자열로 날짜를 표기하는 공통된 규칙
        //2025-07-21T14:30:30
        //2025-07-21
        //14:30:30
        localDate = LocalDate.parse("2002-05-25");//yyyy-MM-dd
        System.out.println(localDate);

        localDate = LocalDate.of(2012,12,25);
        System.out.println(localDate);
        //LocalDate: 년 월 일만 저장


        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = LocalTime.parse("12:01:23");
        localTime = LocalTime.parse("12:01:23.1");
        System.out.println(localTime);//데이터분석
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        localTime = LocalTime.of(12,33,44,111);
        System.out.println(localTime);
        //데이터베이스(데이터저장)=>가져온 데이터를 Local*(Date/Time/DateTime) 이면 편하다
        //날짜,시간,TimeStamp
        //날짜 => LocalDate
        //시간 => LocalTime
        //TimeStamp => LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.parse("2023-11-30T20:00:00") ;//2025-07-21T14:30:30 == ISO 표기법
        System.out.println(localDateTime.getDayOfWeek());
//      DateTimeFormatter : 심플데이트포멧 처럼 LocalDateTime의 문자열 표기 변경
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String dateStr = localDateTime.format(dtf);
        System.out.println(dateStr);


        //2025년 7월의 마지막 일
        System.out.println(localDate.lengthOfMonth());
        //해당 달의 마지막 일(LocalDate)


//        LocalDateTime => LocalDate로 형변환

        System.out.println("localDateTime.toLocalDate().lengthOfMonth():  "+localDateTime.toLocalDate().lengthOfMonth());
        System.out.println("localDateTime.toLocalTime().getMinute():  "+localDateTime.toLocalTime().getMinute());
        //계산 날짜간의 비교나 계산

        //localDate 는 배열처럼 불변데이터

        LocalDate ld = localDate.plusDays(3); //현재 날짜에서 3일 더한것
        // 3일을 더한 새로운 데이트 반환

        System.out.println("localDate.plusDays(3): "+ld);

    }
}
