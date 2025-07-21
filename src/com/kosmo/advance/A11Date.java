package com.kosmo.advance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class A11Date {
    public static void main(String[] args) {
        Date date = new Date(); // 객체를 만드는 시점을 시간으로 갖는다
        System.out.println(date);//Mon Jul 21 11:49:19 KST 2025
        int y = date.getYear();;
        int m = date.getMonth();
        int d = date.getDate();
        int w = date.getDay();
        System.out.println(y);// 2025 => 125  (1900을 더해야함)
        System.out.println(m);// 7월 => 6     (0~11)
        System.out.println(d);// 21일 => 21
        System.out.println(w);// 월요일 => 1   (0이 일요일~ 6이 토요일)
        String weeks [] = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        System.out.print(y+1900+"년/");
        System.out.print(m+1+"월/");
        System.out.print(d+"일/");
        System.out.println(weeks[w]);


        //특정 시간대의 시간 객체 생성법

        //자바 7버전 이하, Calendar(특정 시간대 호출)
//        Calendar cal = Calendar.getInstance();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        cal.set(2024,1,1,22,10,10);
        Date date2 = cal.getTime();
        System.out.println(date2);


        //자바 8버전 이상, ZonedDateTime(특장 시간대 생성)

        Date dat3 = Date.from(ZonedDateTime
                .of(2023,1,1,22,10,10,100, ZoneId.of("Asia/Seoul")).toInstant());
        System.out.println(dat3);


        //수로 된 데이트 객체를 문자열로 출력 :" SimpleDateFormat();
        //yyyy:
        //MM:
        //dd:
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 H:m:s.S");
        Date date4 = new Date();
        System.out.println(sdf.format(date4));

        String dateStr = "2002년 5월 5일 13:13:13.001";
        //Date객체로 생성
        int i = Integer.parseInt("13");// 문자열 => 정수(파싱 : 오류가 발생할수도 있지만 형변환)

        try {
            Date date5 = sdf.parse(dateStr);
            System.out.println(date5);
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }
        //유닉스 시간 (최초의 소형컴푸터 운영체제 유닉스가 시간을 표기한 방법)
        // 유닉스가 만들어진 1970년 부터 밀리초로 시간을 표현
        //시간을 문자열이 아닌 수로 정의(시간 비교가 편리)하기 위해 등장
        //1970.1.1.0.0.0 -> 0
        //1970.1.1.0.1.0 -> 1000
        //1970.1.1.1.1.0 -> 60000
        Date date6 = new Date();
        System.out.println(date6.getTime());
        long time = System.currentTimeMillis();
        System.out.println(time); //1753069605153

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = "1970-01-01 01:00:00"; //1000*60*60
        Date date7 = null;
        try {
            date7 = sdf2.parse(str);
            System.out.println(date7);
            System.out.println(date7.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long l =20000000000000L;
        Date date8  = new Date(l);//유닉스 시간으로 Date 객체 생성
        System.out.println(date8);
    }
}
