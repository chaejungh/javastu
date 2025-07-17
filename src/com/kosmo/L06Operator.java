package com.kosmo;

public class L06Operator {
    public static void main(String[]args){
        int i =10;
        //산술연산자(Arithmetic Operator)      +, -, *, /, %
        System.out.println(i+10); //20
        System.out.println(i-3);//7
        System.out.println(i*7);//70
        System.out.println(i/4);//2
        System.out.println(i%3);//1

        //증감 연산자 (증가 + 감소  Increment + Decrement)
        //b++, ++b  b--, --b
        System.out.println(i++);
        //증감연산자가 뒤에 있으면 앞에 연산(println)을 먼저하고 증가
        System.out.println(i);
        System.out.println(--i);


        //대입 연산자(Assignment Operator)
        // =, +=, -=, *=, /=, %=
        int a =10;//대입 연산자(****) 오른쪽이 먼저 연산됨 그 결과를 대입
        a+=2; //a=a+2
        double r =3;
        r/=2;
        System.out.println(a);
        System.out.println(r);
        a*=a;
        System.out.println(a);



        ///비트연산자(Bitwise Operator)
        //  ~:  보수연산, not 연산
        System.out.println(~0);
        //
        System.out.println(~5);//-6

        //쉬프트 연산
        //<< : 왼쪽 쉬프트 연산
        //>> : 오른쪽 쉬프트 연산
        // 1111 <<1    1110
        System.out.println(" ");

//           1073741823
        System.out.println(i<<1);
        // 0001 => 0010
        System.out.println(i<<2);
        // 0001 => 0100
        System.out.println(i>>1);
        // 0001 => 0000

        //합집합(OR) 교집합(AND)
        //0*0 = 0
        //1*0 = 0
        //1*1 = 1

        //1+1 = 1
        //1+0 = 1
        //0+0 = 0

        //1010 & 0101 = 0
        //1010 & 0111 = 2


        //XOR (Exclusive OR)

        //0 ^ 0 = 0
        //1 ^ 0 = 1
        //0 ^ 1 = 1
        //1 ^ 1 = 0

    }
}
