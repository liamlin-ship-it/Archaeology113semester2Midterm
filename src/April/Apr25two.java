package April;

import java.util.Arrays;
import java.util.Scanner;

public class Apr25two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.printf("average is %.2f", average(array));
        System.out.print("\nmax number is "+ findMax(array));
        scanner.close();
    }

    public static double average(int[] arr){
        double sum = 0;
        for (int num : arr){
            sum += num;
        }

        return sum / arr.length;
    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
