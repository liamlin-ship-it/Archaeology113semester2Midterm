package March;

import java.util.Scanner;

public class Mar20two {
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
            int max = 0;
            for (int j = 0; j < col; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + " max: " + max);
        }
    }
}
