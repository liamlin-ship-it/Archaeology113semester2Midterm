package March;

import java.util.Scanner;

public class BetterMar6two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0){
            System.out.println(0);
        }else {
            int[] digits = new int[10];
            int count = 0;

            while (n != 0){
                int digit = n % 10;
                digits[count] = digit;
                count++;
                n /= 10;
            }

            for (int i = count - 1; i >= 0; i--){
                System.out.print(digits[i] + " ");
            }
        }
    }
}
