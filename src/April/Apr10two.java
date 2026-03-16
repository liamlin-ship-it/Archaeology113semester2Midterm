package April;
//The order of the array was changed

import java.util.Scanner;

public class Apr10two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        horizontalFlip(matrix);
    }

    public static void horizontalFlip(int[][] matrix){

        for (int i = 0; i < matrix.length; i++){
            for (int j = matrix[0].length - 1; j >= 0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
