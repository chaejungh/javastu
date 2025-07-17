package com.kosmo.mywork;
import java.util.*;
//학생 점수 통계 프로그램
//
//Scanner로 학생 수(n)을 입력받아,
//각 학생의 이름과 점수를 차례대로 입력받아
//아래 요구사항을 모두 만족하는 코드를 작성하세요.
//
//요구사항
//모든 학생의 이름과 점수를 배열에 저장 (최대 100명)
//평균 점수와 표준편차를 구해 출력
//        (표준편차 공식: √(∑(점수-평균)²/n))
//점수가 중복되지 않는 최고점 학생(여러 명 가능)의 이름을 모두 출력// 한명만 출력
//60점 미만 학생의 이름과 점수를 모두 출력
//
//학생 이름을 입력받아, 해당 학생이 존재하면 점수와 등수(내림차순)를 출력, 없으면 "존재하지 않음"을 출력
//        (단, 등수는 동점자 처리해야 함)

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input student num n:");
        int n = scan.nextInt();
        String[][]student = new String[n][n];
        String[]stu_Name = new String[n];
//        System.out.println(Arrays.deepToString(student)); //배열 모양 확인
        Integer[] score = new Integer[n];
        int i =0;
        int j =0;
        int jj =0;
        int p =0;
        int high_S=0;
        int count=0;
        int stu_Find_Num = 0;
        double sum = 0;
        double average = 0.0;
        double st_Devi = 0.0;
//        HashSet<Integer> set = new HashSet<>();

        while(i<n){
            System.out.print("input student name(enter):");
            student[i][0]= scan.next(); // student name;
            System.out.print("input student score(enter):");
            student[i][1] = scan.next();//score;
            i++;
        }
//        String[][]student2 = student.split(" ");
        while(j<n){
            try {
                score[j] = Integer.parseInt(student[j][1]);// String으로 입력받은 점수 int 배열에 저장
            }
             catch (NumberFormatException ex){
                ex.printStackTrace();
            }
//            set.add(score[j]);
            if(high_S<score[j]){
                high_S = score[j];
                jj=j;
            }else if(high_S==score[j]){
                high_S=0;
            }
            if(score[j]<60){
                System.out.printf("60미만의 학생:%s 점수:%s\n",student[j][0],student[j][1]);
            }
            sum+=score[j];
            j++;
        }
//        System.out.println("change String to integer");

        average = sum/n; //평균 구하기

        while(p<n){
            st_Devi += Math.pow((average - score[p]),2); //각 자료마다 (평균으로 부터 떨어진값)  ^2 을 해준다
            p++;

        }

        st_Devi =Math.sqrt((st_Devi/n));
        System.out.printf("평균 점수:%f\n표준편차:%f\n",average,st_Devi );
        System.out.printf("점수가 제일 높은 학생:%s\n",student[jj][0]);


        System.out.println(" ");
        System.out.print("학생이름 찾기:");
        String stu_NameFind = scan.next();
        for (int q =0;q<n;q++) {//학생 이름 데이터 옮기기
            stu_Name[q] = student[q][0];
        }
        Arrays.sort(stu_Name);
        int find = Arrays.binarySearch(stu_Name, stu_NameFind );
        if(find==-1){
            System.out.println("존재하지 않음");
        }
        try {
            stu_Find_Num = Integer.parseInt(student[find][1]);// String으로 입력받은 점수 int 배열에 저장
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        Arrays.sort(score, Collections.reverseOrder());
        for(int s =0;s<score.length-1;s++){
            if(Objects.equals(score[s], score[s + 1])){
                score[s]=0;//중복인 점수를 0으로 바꿔 중복 점수 없애기
            }
        }
        Arrays.sort(score, Collections.reverseOrder());
        while(true){
            if(score[count]==stu_Find_Num)break;
            count++;
        }
        System.out.printf("점수:%d 등수:%d등",score[count],count+1);


    }

}
