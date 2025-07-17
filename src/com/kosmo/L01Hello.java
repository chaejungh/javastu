    package com.kosmo;
    //경민(ckm.com) 연구소 만든 Math
    //정호(cjh.com) 연구소 만든 Math
    //java 에서 기본으로 제공하는 Math
    //com.kosmo.L01_Hello
    public class L01Hello {
        public static void main(String[] args){
            System.out.printf("2^10:%d",(int)Math.pow(2,10));
            /*System.out.printf("2^10:%d", com.ckm.Math.pow(2,10)); 중복가능하므로 도메인 주소를 적는다
            System.out.printf("2^10:%d", com.cjh.Math.pow(2,10));

            package : 클래스를 유일하게 만드는 패키징

            jdk(Java Development Kit: 자바의 개발자 도구)
            자바의 실행도구(Java Runtime Environment == java), compiler(javac), 기본패키지
           JRE: 자바를 실행하는 엔진
           Compiler: java 문서를 JRE가 실행하기 편하게 class 문서로 변환(compile)하는 도구

           기본패키지 : 개발자를 위한 기본 패키지를 library로 제공
           library : 외부에서 재공하는 것을 사용할 수 있도록 가공된 형태 ==  도구
           ㄴ package: library를 폴더 단위로 묶은 것 => 배포(deploy)에 유리

           Deploy(배포) : 작성한 코드를 외부에 보내는 행위

           java.lang package
           main 함수가 실행될 때 자동으로 import 되는 package

           class(System, Math), main(L01_Hello)이 포함된 클래스
           1.main이 포함된 클래스는 자바 어플(크롬,메모장,인텔리제이)로 jre에 의해 실행된다.
           2.Math.pow 처럼 자주 사용하는 도구를 미리 정의하고 재사용**
           3.System 처럼 실행되고 있는 것을 참조하고 제어할 수 있다. 재사용 **
             */

        }
    }
