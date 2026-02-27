package March;

import java.util.Scanner;

public class Mar27thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();
        while (true){
            int n = scanner.nextInt();
            sum += n;
            String check = scanner.next();

            if (check.equalsIgnoreCase("n")){
                System.out.println(sum);
                return;
            }
        }
    }
}
