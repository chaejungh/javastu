package com.kosmo.advance;

import java.awt.*;
import java.io.*;
import java.util.Arrays;


class Block implements Serializable { // 타입에 객체가 직렬화 대상임을 명시해야함 ******
    private static final long serialVersionUID = 1L; // 직렬화 한 객체간의 구붑ㄴ
    int x;
    int y;
    int[] color; // {0~255,0~255,0~255}
                //  r      g      b
//    Color color2; // Color Serializable 을 구현했을때만 가능
    public Block(int x, int y, int [] color){
        this.x =x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() { //객체 정보(필드)를 출력하는 함수
        return "Block{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + Arrays.toString(color) +
                '}';
    }
}
//객체로 만들어서 저장
public class A18ObjectInputOutput {
    public static void main(String[] args) {
        int[] color = {0,255,50};
        Block block = new Block(10,10,color);
        // 직렬화 : 객체 => byte 정보로 변환 후 파일로 생성

        try (
                FileOutputStream fileOut = new FileOutputStream("A18block.ser");
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                // 객체(인스턴스) == 오브젝트 를 파일로 작성할 준비
        ){
            objectOut.writeObject(block);
            System.out.println("블럭을 파일로 작성 완료");
        } catch (FileNotFoundException e) {
            System.out.println("경로를 찾을 수 없음");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("블럭 객체를 파일로 작성 중 오류");
            e.printStackTrace();
        }
        //파일로 저장된 객체를 다시 불러와서 갹체로 만들기

        System.out.println("저장한 블럭 객체 불러오는 중....");
        try(
                FileInputStream fileIn = new FileInputStream("A18block.ser");
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        ){      Object objBlock = objectIn.readObject();
                Block b = (Block) objBlock;
                System.out.println(b);


        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("객체를 읽는 도중 오류가 발생헀습니다.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("받아온 객체가 같은 타입이 없음");
            e.printStackTrace();
        }

    }
}
