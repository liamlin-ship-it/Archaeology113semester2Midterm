package March;

import java.util.Scanner;

public class Mar7two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        String mark = scanner.next();
        double two = scanner.nextDouble();

        if (mark.equals("+")){
            System.out.println(one + two);
        } else if (mark.equals("-")){
            System.out.println(one - two);
        } else if (mark.equals("*")) {
            System.out.println(one * two);
        } else if (mark.equals("/")) {
            System.out.println(one / two);
        }else {
            System.out.println("Fail");
        }
    }
}
