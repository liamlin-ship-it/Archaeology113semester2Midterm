package March;

import java.util.Scanner;

public class BetterMar28one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0){
            System.out.println(0);
        } else if (n == 1){
            System.out.println(3);
        } else{
            int a = 0;
            int b = 3;
            int result = 0;
            //result will store the calculated term at i

            for (int i = 2; i <= n; i++){
                result = a + b;
                a = b;   //move (i - 2) to (i - 1)
                b = result;   //move (i - 2) to result
            }
            System.out.println(result);
        }
    }
}
