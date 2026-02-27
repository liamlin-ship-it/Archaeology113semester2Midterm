package March;

import java.util.Scanner;

public class Mar20one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++){
            int countRow = 0;
            for (int j = 0; j < col; j++){
                countRow += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + countRow);
        }

        for (int j = 0; j < col; j++){
            int countCol = 0;
            for (int i = 0; i < row; i++){
                countCol += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + countCol);
        }
    }
}
