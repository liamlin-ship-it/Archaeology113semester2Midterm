package Midterm;

import java.util.Scanner;

public class MethodMidtermOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.next();
        }

        int n = scanner.nextInt();
        String element = scanner.next();

        if (0 <= n && n < 5){
            for (int i = 0; i < arr.length; i++){
                System.out.print(nameChange(arr, n, element)[i] + " ");
            }
        }else {
            System.out.println("Index is out of range!");
        }
    }

    public static String[] nameChange(String[] arr, int n, String element){
        arr[n] = element;
        return arr;
    }
}
