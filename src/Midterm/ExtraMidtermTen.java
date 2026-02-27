package Midterm;

//calculate the max subtract min of each column

import java.util.Scanner;

public class ExtraMidtermTen {

    //Finds the max/min difference for ONE row
    public static int[] calculateColRange(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[cols];

        //save the answer
        for (int j = 0; j < cols; j++){
            int max =  matrix[0][j];
            int min = matrix[0][j];

            for (int i = 0; i < rows; i++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }else if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            result[j] = max -  min;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 橫列數量
        int m = scanner.nextInt();  // 直行數量

        // 讀取矩陣
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 計算每一橫列的差值
        int[] colRanges = calculateColRange(matrix);

        // 輸出結果
        for (int i = 0; i < colRanges.length; i++) {
            System.out.print(colRanges[i]);
            if (i < colRanges.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
