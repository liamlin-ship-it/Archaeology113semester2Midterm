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

            // If the command is "y", the loop just naturally repeats on its own!
            // We don't even need an 'if' statement for "y" anymore.
            if (check.equalsIgnoreCase("n")){
                System.out.println(sum);
                return;
            }
        }
    }
}
