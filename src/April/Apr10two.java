package April;
//The order of the array was changed

import java.util.Scanner;

public class Apr10two {
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

        int[][] flippedArr = horizontalFlip(arr);

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(flippedArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] horizontalFlip(int[][] arr){
        int[][] result = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++){
            //arr.length is height
            for (int j = 0; j < arr[0].length; j++){
                //arr[0].length is width
                result[i][j] = arr[i][arr[0].length - 1 - j];
            }
        }
        return result;
    }
}
