package April;

import java.util.Scanner;

public class Apr11two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isMultipleOfSeven(n)){
            System.out.println(digitSum(n) + " true");
        }else {
            System.out.println(digitSum(n) + " false");
        }
    }

    public static int digitSum(int n) {
        int result = 0;

        while (n > 0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static boolean isMultipleOfSeven(int n) {
        return digitSum(n) % 7 == 0;
    }
}
