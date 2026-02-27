package March;

import java.util.Scanner;

public class Mar20thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;

        String sumString = String.valueOf(sum);
        StringBuilder sb = new StringBuilder(sumString).reverse();
        String check = sb.toString();

        if (sumString.equals(check)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
