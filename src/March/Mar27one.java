package March;

import java.util.Scanner;

public class Mar27one {
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

        for (int j = 0; j < col; j++){
            System.out.print(arr[0][j] + " ");
        }

        for (int i = 1; i < row - 1; i++){
            System.out.print(arr[i][col - 1] + " ");
        }

        for (int j = col - 1; j > 0; j--){
            System.out.print(arr[row - 1][j] + " ");
        }

        for (int i = row - 1; i > 0; i--){
            System.out.print(arr[i][0] + " ");
        }
    }
}
