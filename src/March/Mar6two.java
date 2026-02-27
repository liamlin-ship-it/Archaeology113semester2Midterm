package March;

import java.util.Scanner;

public class Mar6two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = n / 1000;
        int b = (n % 1000) / 100;
        int c = (n % 100) / 10;
        int d = n % 10;

        if (n < 0 || n > 10000){
            System.out.println("wrong!");
        }else {
            System.out.println("Thousands : " + a);
            System.out.println("Hundreds : " + b);
            System.out.println("Tens : " + c);
            System.out.println("Ones : " + d);
        }
    }
}
