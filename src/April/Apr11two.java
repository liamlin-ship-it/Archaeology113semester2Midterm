package April;

import java.util.Scanner;

public class Apr11two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = digitSum(n);
        System.out.print(sum + " ");
        System.out.println(isMultipleOfSeven(sum));
    }

    public static int digitSum(int n) {
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isMultipleOfSeven(int n) {
        return n % 7 == 0;
    }
}
