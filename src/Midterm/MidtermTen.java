package Midterm;

import java.util.Scanner;

public class MidtermTen {

    //Finds the max/min difference for ONE row
    public static int calculateRowRange(int[] row) {
        int max = row[0];
        int min = row[0];

        //This loop goes through the columns of THIS specific row
        for (int result : row){
            if (result > max){
                max = result;
            }else if (result < min){
                min = result;
            }
        }
        return max - min;
    }

    //Changes rows and saves the results
    public static int[] calculateMatrixRowRanges(int[][] matrix) {
        int[] result = new int[matrix.length];

        //save the answer
        for (int i = 0; i < matrix.length; i++){
            result[i] = calculateRowRange(matrix[i]);
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
        int[] rowRanges = calculateMatrixRowRanges(matrix);

        // 輸出結果
        for (int i = 0; i < rowRanges.length; i++) {
            System.out.print(rowRanges[i]);
            if (i < rowRanges.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
