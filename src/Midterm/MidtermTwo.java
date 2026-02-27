package Midterm;

import java.util.Scanner;

public class MidtermTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1){
            int n = scanner.nextInt();
            int result1 = cubeVolume(n);
            System.out.println(result1);
        }else {
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            int result2 = boxVolume(length, width, height);
            System.out.println(result2);
        }
    }

    public static int cubeVolume(int n){
        return n * n * n;
    }

    public static int boxVolume(int length, int width, int height){
        return length * width * height;
    }
}
