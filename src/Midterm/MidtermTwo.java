package Midterm;

import java.util.Scanner;

public class MidtermTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1){
            int length = scanner.nextInt();
            System.out.println(cubeVolume(length));
        }else {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(boxVolume(a, b, c));
        }
    }

    public static int cubeVolume(int length) {
        return length * length * length;
    }

    public static int boxVolume(int a, int b, int c) {
        return a * b * c;
    }
}
