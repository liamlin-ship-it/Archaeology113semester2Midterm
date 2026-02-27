package April;
//The order of the array was not changed

import java.util.Scanner;

public class BetterApr10two {
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

        horizontalFlip(arr);
    }

    public static void horizontalFlip(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = arr[0].length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
