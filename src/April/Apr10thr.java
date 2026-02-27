package April;

import java.util.Scanner;

public class Apr10thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double root = Math.round(Math.sqrt(n));
        double openRoot = Math.pow(root, 2);

        System.out.println((int) openRoot);
        System.out.println((int) (n - openRoot));
    }
}
