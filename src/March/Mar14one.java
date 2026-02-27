package March;

import java.util.Scanner;

public class Mar14one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " is not an odd number.");
        }else {
            for (int i = 0; i < n; i+=2){
                System.out.println(" ".repeat(i / 2) + "A".repeat(n - i));
            }
        }
    }
}
