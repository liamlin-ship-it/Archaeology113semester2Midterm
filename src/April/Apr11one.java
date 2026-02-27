package April;

import java.util.Scanner;

public class Apr11one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 == 1){
            System.out.println((int) square(n2));
        }else {
            System.out.println((int) cube(n2));
        }
    }

    public static double square(int n2){
        return Math.pow(n2, 2);
    }

    public static double cube(int n2){
        return Math.pow(n2, 3);
    }
}
