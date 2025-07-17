//package com.kosmo.mywork;
//
//public class Maze2 {
//    boolean reached = false; // 도착점 도달 여부
//
//while (queue.size() > 0) {
//        int[] now = queue.remove(0);
//        int row = now[0];
//        int col = now[1];
//        int count = now[2];
//
//        // 도착점이면 거리 출력
//        if (maze[row][col] == 3) {
//            System.out.println("최단 경로 이동 횟수: " + count);
//            reached = true;
//            break;
//        }
//
//        // 네 방향으로 이동 시도
//        for (int d = 0; d < 4; d++) {
//            int nextRow = row + moveRow[d];
//            int nextCol = col + moveCol[d];
//
//            // 배열 밖이면 skip
//            if (nextRow < 0 || nextRow >= maze.length || nextCol < 0 || nextCol >= maze[0].length)
//                continue;
//            // 벽이거나 방문한 곳이면 skip
//            if (maze[nextRow][nextCol] == 1 || visited[nextRow][nextCol])
//                continue;
//
//            // 이동 가능하면 큐에 추가, 방문 표시
//            queue.add(new int[]{nextRow, nextCol, count + 1});
//            visited[nextRow][nextCol] = true;
//        }
//    }
//}
