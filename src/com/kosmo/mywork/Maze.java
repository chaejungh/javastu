package com.kosmo.mywork;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Maze {
    public static void main(String[] args) {
        int[][] maze = {
                {2, 0, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 3}
        };
        int[][] vis = new int[5][5];
        int i=0;
        int j=0;

        int count =0;
        vis[0][0] = maze[0][0];
        while(true){

            if (maze[i+1][j]==0 && maze[i+1][j]!=vis[i+1][j] && i+1<6){//하
                vis[i][j] = maze[i+1][j];
                i++;count++;
            } else if (maze[i][j+1]==0 && maze[i][j+1]!=vis[i][j+1]&& i+1<6) {//우
                vis[i][j] = maze[i][j+1];
                j++;count++;
            } else if (maze[i][j-1]==0  && maze[i][j-1] != vis[i][j-1] && j-1>=0) {
                vis[i][j] = maze[i][j-1];
                j--;count++;
            } else if (maze[i-1][j]==0 && maze[i-1][j]!=vis[i-1][j]&& i-1>=0) {
                vis[i][j] = maze[i-1][j];
                i--;count++;
            } else System.out.println("도착 불가");
            if (vis[i][j]==3)break;
        }
        System.out.println(count);

    }
}
