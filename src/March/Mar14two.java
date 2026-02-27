package March;

import java.util.Scanner;

public class Mar14two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " is not an odd number.");
        }else {
            //cuz i-=2, so i have to > 1
            for (int i = n; i > 1; i-=2){
                System.out.println(" ".repeat((n - i) / 2) + "A" + " ".repeat(i - 2) + "A");
            }
            System.out.println(" ".repeat(n / 2) + "A");
        }
    }
}
