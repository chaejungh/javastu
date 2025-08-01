package com.kosmo.ex;

public class S15TowDomArrayAdvance {
    public static void main(String[] args) {
        int[][] arr = {
                {7, 2},
                {9, 4}
        };

    }


    /*
---

## ✅ 문제 1. 행 또는 열의 합 중 최댓값 찾기

### 📘 문제 설명

N×N 크기의 2차원 배열이 주어졌을 때,
각 행과 각 열의 합을 구하여 그 중 **가장 큰 값**을 출력하세요.

### 📥 입력 예시 (3×3 배열)

```java
int[][] arr = {
    {3, 8, 1},
    {5, 2, 6},
    {4, 9, 7}
};
```
  int hang=0;
        int ryulBig=0;
        int biggest=0;
        int[]ryul = new int[arr.length];
        for(int i = 0;i<arr.length;i++) {
            int j=0;
            for (j =0; j < arr[i].length; j++) {
                hang += arr[i][j];
                ryul[j]+=arr[i][j];
            }
            if(biggest<hang){biggest=hang;}
        }
        ryulBig =ryul[0];
        for (int i = 0; i < ryul.length ; i++) {
            if(ryulBig< ryul[i]){ryulBig=ryul[i];}
        }
        if (ryulBig>biggest){
            System.out.println(ryulBig);
        }else if (ryulBig<biggest) {
            System.out.println(biggest);
        }else System.out.println("행의 총합과 열의 총합은 같다");
### 📤 출력 예시

```
20
```

> 3행의 합 4+9+7 = 20이 최대

---

## ✅ 문제 2. 2차원 배열 정렬 후 재구성

### 📘 문제 설명

M×N 크기의 2차원 배열이 주어졌을 때,
해당 배열의 모든 값을 **1차원 배열로 정렬한 후**,
다시 M×N 형태의 2차원 배열로 재구성하여 출력하세요.

### 📥 입력 예시

```java
int[][] arr = {
    {7, 2},
    {9, 4}
};
```
[0][0]>>[1][0]
[0][1]>>[0][0]
[1][0]>>[1][1]
[1][1]>>[0][1]

for(int i=0;i<arr.length;i++){

        arr1[i] = arr[i][1] //arr1에 (0,1)(1,1) 저장
        arr2[i] = arr[i][0] //arr2에
}
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        arr[0][j] = arr1[j];
        arr[1][j] = arr2[j];
    }
}
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i];j++){
        System.out.println(arr[i][j]);
    }
}

### 📤 출력 예시

```
2 4
7 9
```

---

## ✅ 문제 3. 3×3 배열의 스도쿠 검사

### 📘 문제 설명

3×3 크기의 정수 배열이 주어졌을 때,
각 행과 각 열에 1, 2, 3이 각각 **한 번씩만 등장**하는지 검사하세요. (대각선 제외)
모든 조건을 만족하면 `"Valid"`, 아니면 `"Invalid"`를 출력하세요.

### 📥 입력 예시

```java
 int[][] board = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}
        };
        boolean flag=true;
        int hang =0;
       int ryul=0;
        for(int i = 0;i<board.length;i++) {

            for (int j =0; j < board[i].length; j++) {
                hang += board[i][j];
                ryul+= board[j][i];
            }
            if(hang != 6|| ryul != 6){System.out.print("Invalid");flag =false;break;}
            hang=0;
            ryul=0;
        }
        if (flag){
            System.out.println("Valid");
        }
### 📤 출력 예시

```
Valid
```

---

## ✅ 문제 4. 상하좌우보다 큰 값 찾기

### 📘 문제 설명

N×N 크기의 정수 배열이 주어졌을 때,
**가장자리를 제외한 내부의 원소 중에서**
상하좌우 값보다 **모두 큰 위치 (i,j)** 를 찾아 출력하세요.
여러 개일 경우 모두 출력하세요.

### 📥 입력 예시 (5×5 배열)

```java
int[][] arr = {
                {1, 3, 4, 2, 1},
                {5, 6, 2, 4, 3},
                {9, 1, 7, 8, 5},
                {3, 4, 6, 2, 7},
                {1, 2, 3, 5, 4}
        };
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<arr[i].length-1;j++){

                if(arr[i][j]>arr[i-1][j]){count++;}
                if(arr[i][j]>arr[i+1][j]){count++;}
                if(arr[i][j]>arr[i][j-1]){count++;}
                if(arr[i][j]>arr[i][j+1]){count++;}
                if(count==4){System.out.println("("+i+","+j+")");}
                count=0;
            }
        }

### 📤 출력 예시

```
(2,3)
```

> `arr[2][3] = 8`이고 상(4), 하(2), 좌(7), 우(5)보다 큼 → 유일한 조건 만족

---

## ✅ 문제 5. 2차원 배열 90도 회전

### 📘 문제 설명

N×N 크기의 정수 배열이 주어졌을 때,
해당 배열을 **90도 시계 방향으로 회전한 결과**를 출력하세요.

### 📥 입력 예시

```java
 int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] arr1 = new int[arr.length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[i][j] = arr[j][i];

            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }


### 📤 출력 예시

```
7 4 1
8 5 2
9 6 3
```

---

## ✅ 문제 1. 행 또는 열의 합 중 최댓값 찾기

```java
public class MaxRowOrColSum {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 8, 1},
            {5, 2, 6},
            {4, 9, 7}
        };

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            if (rowSum > max) max = rowSum;
            if (colSum > max) max = colSum;
        }

        System.out.println(max);
    }
}
```

---

## ✅ 문제 2. 2차원 배열 정렬 후 재구성

```java
import java.util.Arrays;

public class FlattenAndSort {
    public static void main(String[] args) {
        int[][] arr = {
            {7, 2},
            {9, 4}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int[] temp = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[index++] = arr[i][j];
            }
        }

        Arrays.sort(temp);

        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = temp[index++];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## ✅ 문제 3. 3×3 배열의 스도쿠 검사

```java
public class SudokuCheck {
    public static void main(String[] args) {
        int[][] board = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };

        boolean valid = true;

        for (int i = 0; i < 3; i++) {
            int[] rowCheck = new int[4]; // 인덱스 1~3 사용
            int[] colCheck = new int[4];

            for (int j = 0; j < 3; j++) {
                rowCheck[board[i][j]]++;
                colCheck[board[j][i]]++;
            }

            for (int k = 1; k <= 3; k++) {
                if (rowCheck[k] != 1 || colCheck[k] != 1) {
                    valid = false;
                    break;
                }
            }

            if (!valid) break;
        }

        System.out.println(valid ? "Valid" : "Invalid");
    }
}
```

---

## ✅ 문제 4. 상하좌우보다 큰 값 찾기

```java
public class MaxInCross {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 4, 2, 1},
            {5, 6, 2, 4, 3},
            {9, 1, 7, 8, 5},
            {3, 4, 6, 2, 7},
            {1, 2, 3, 5, 4}
        };

        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int val = arr[i][j];
                if (val > arr[i - 1][j] &&
                    val > arr[i + 1][j] &&
                    val > arr[i][j - 1] &&
                    val > arr[i][j + 1]) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
```

---

## ✅ 문제 5. 2차원 배열 90도 회전

```java
public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

*/
}
