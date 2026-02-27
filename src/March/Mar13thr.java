package March;

import java.util.Scanner;

public class Mar13thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int n = scanner.nextInt();

            if (n > 0){
                int count = 0;

                for (int i = 1; i <= n; i++){
                    if (n % i == 0){
                        count++;
                    }
                }
                System.out.println(count);
            } else if (n == 0) {
                break;
            }
        }
    }
}
