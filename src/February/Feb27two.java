package February;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Feb27two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;
        while (true){
            int n = scanner.nextInt();

            if (n == 0){
                break;
            }else {
                sum += n;
                count++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Sum: " + sum + ", Average: " + df.format(sum / count));
    }
}
