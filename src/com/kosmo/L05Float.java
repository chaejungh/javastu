package com.kosmo;

public class L05Float {
    public static void main(String[]args){
        /*자바는 2개의 실수 데이터 타입을 갖는다(float double)
        3.14 => double 형
        3.14F, 3.14f => float 형

        1 = int
        1L => long
        float 4byte 실수형 데이터
        double 8byte 실수형
        */
        float f = 3.14f;
        double d = 3.14;
        //자바는 실수가 8바이트 정돈ㄴ 되어야 쓸만하다고 생각하고 실수의 기본 타입으로 double을 지정

        System.out.println(Integer.MAX_VALUE);

        f= 2147483647f;
        System.out.println(f);
        //2147483647
        //2147483647 *10^9
        /// 2.1474836E9
        //2.1474836E9 : 부동소수점 == float
    f = 123456789012345678901234567890123456789f;
        System.out.println(f);//1.2345679E38
        //실수 데이터는 지수부과 가수부로 나누는데
//        가수부로 표현할ㅇ수없는  수는 반올림으로 잘라낸다(0으로 바꾼다)
        //엄청 큰 수나 작은 수를 표현할 수 있다.
        //float 는 4바이트를 지수부와 가수부로 나누기때문에 수의 정밀도가 떨어진다
        //때문에ㅔ 자바는 8바이트짜리 실수인 double 을 자바의 기본 실수로 저장하고 있다.
        d = 123456789012345678901234567890123456789f;
//        float는 더블보다 작은 수기 때문에 더블 변수가 참조할 수 있다.
        d = 1234567890123456789012345678901234567891232131132123233123211.0;
        System.out.println(d);
        System.out.println(Double.MAX_EXPONENT);///E1023
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        //실수는 천문학적인 수를 표현 => 무한대

        System.out.println(d*d*d*d*d*d*d);
        System.out.println(-d*d*d*d*d*d*d);


        System.out.println(3.14);
        System.out.println(3.14f);;//명시적
        //수를 리터럴하게 작성할때 => 기본 데이터
        //리터럴: 있는 그대로


    }
}
