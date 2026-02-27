package February;

import java.util.Scanner;

public class Feb27thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }

        int exchange1 = scanner.nextInt();
        int exchange2 = scanner.nextInt();

        int temp = num[exchange1];
        num[exchange1] = num[exchange2];
        num[exchange2] = temp;

        for (int result : num){
            System.out.print(result + " ");
        }
    }
}
