package April;

import java.util.Scanner;

public class Apr10one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        double value = scanner.nextDouble();

        double[] newArray = incrementArray(arr, value);

        for (double result : newArray){
            System.out.print(result + " ");
        }
    }

    public static double[] incrementArray(int[] arr, double value){
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i] + value;
        }
        return result;
    }
}
