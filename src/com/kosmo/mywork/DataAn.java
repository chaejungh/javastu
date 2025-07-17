//문제: 성적 데이터 분석 시스템
//        요구사항
//
//        학생 수(n)를 입력받고, 각 학생의 이름, 국어/영어/수학 점수를 입력받아 배열에 저장한다.0

//        모든 학생의 총점과 평균을 계산해 저장한다.0
//
//        각 과목(국어/영어/수학)의 최고점과 해당 학생 이름(여러 명일 수 있음)을 출력한다.0
//
//        평균이 전체 학생 평균 이상인 학생의 이름과 평균을 모두 출력한다.0
//
//        특정 과목(입력받은 과목명)의 점수가 전체 평균 이하인 학생의 이름을 모두 출력한다.
//
//        전체 학생을 평균 점수 내림차순(동점자는 이름 오름차순)으로 정렬하여, 이름/총점/평균을 표 형태로 출력한다.

//        조건
//
//        반드시 배열과 while문만 사용할 것 (List/Set/Stream 등 사용 금지)
//
//        최대 100명까지 입력 가능
//
//        평균은 소수점 2자리까지, 정렬도 직접 구현
package com.kosmo.mywork;
import java.util.*;
public class DataAn {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number of students:");
       int n = scan.nextInt();
       String [][] kor = new String[n][n];
       String [][] eng= new String[n][n];
       String [][] math = new String[n][n];
       String [][] total_Score = new String[n][n];
       String [][] total_Average = new String[n][n];
       Integer[] score = new Integer[n];
        int i =0;
        int q =0;
        int j =0;
        int[]kk =new int[n];
        int[]ee =new int[n];
        int[]mm =new int[n];
        int high_K = 0;
        int high_E = 0;
        int high_M = 0;
        int sum = 0;
        double average = 0;
        double total_St_Average = 0;
       while(i<n){
           System.out.print("input student name(enter):");
           kor[i][0]= scan.next(); // student name;
           eng[i][0]=kor[i][0];
           math[i][0]=kor[i][0];
           System.out.print("input kor,eng,math score(enter):");
           kor[i][1] = scan.next();//score;
           eng[i][1] = scan.next();//score;
           math[i][1] = scan.next();//score;
           i++;
        }
try{
       while(q<n){

           sum += Integer.parseInt(kor[q][1]);
           sum += Integer.parseInt(eng[q][1]);
           sum += Integer.parseInt(math[q][1]);

           average = sum;

           total_Score [q][1] = Integer.toString(sum);
           total_Score [q][0] = kor[q][0];
            average /= 3;
           total_St_Average+=average;
            total_Average [q][1] = Double.toString(average);
           total_Average [q][0] = kor[q][0];
            q++;
       }
       total_St_Average /= n;

            while (j < n) {

                score[j] = Integer.parseInt(kor[j][1]);
                if (high_K < score[j]) {
                    high_K = score[j];
                    kk[j] = j;
                }
                score[j] = Integer.parseInt(eng[j][1]);
                if (high_E < score[j]) {
                    high_E = score[j];
                    ee[j] = j;
                }
                score[j] = Integer.parseInt(math[j][1]);
                if (high_M < score[j]) {
                    high_M = score[j];
                    mm[j] = j;
                }
                j++;
            }

        j=0;
        System.out.printf("\n국어 최고점:%d, ",high_K);
        while (j<n){
            if(kk[j]!=0){
                System.out.printf("최고점자: %s",kor[j][0]);
            }
            j++;
        }
        j=0;
        System.out.printf("\n영어 최고점:%d, ",high_E);
        while (j<n){
            if(ee[j]!=0){
                System.out.printf("최고점자: %s",eng[j][0]);
            }
            j++;
        }
        j=0;
        System.out.printf("\n수학 최고점:%d, ",high_M);
        while (j<n){
            if(mm[j]!=0){
                System.out.printf("최고점자: %s",math[j][0]);
            }
            j++;
        }
        j=0;
        while (j<n){
            if(total_St_Average<=Double.parseDouble(total_Average[j][1])){
                System.out.printf("평균 이상:%s:%.2s\n",total_Average[j][0],total_Average[j][1]);
            }
            j++;
        }
        j=0;

        System.out.print("Input the Subject(Kor, Eng, Math):");
        String sub = scan.next();//특정 과목 입력

        if(Objects.equals(sub, "Kor")) {
            while (j<n) {
                if (total_St_Average >= Integer.parseInt(kor[j][1])) {
                    System.out.printf("국어 평균 이하:%s ", kor[j][0]);
                }
                j++;
            }
            j =0;
        } else if (Objects.equals(sub, "Eng")) {
            while (j<n) {
                if (total_St_Average >= Integer.parseInt(eng[j][1])) {
                    System.out.printf("영어 평균 이하:%s ", eng[j][0]);
                }
                j++;
            }
            j =0;
        } else if (Objects.equals(sub, "Math")) {
            while (j<n) {
                if (total_St_Average >= Integer.parseInt(math[j][1])) {
                    System.out.printf("수학 평균 이하:%s ", math[j][0]);
                }
                j++;
            }
            j =0;
        }else{
            System.out.println("Error");
        }


}
catch (NumberFormatException ex){
    ex.printStackTrace();
}




    }
}
