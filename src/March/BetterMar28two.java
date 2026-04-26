package March;

import java.util.Scanner;

public class BetterMar28two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String[] spl = input.split("");
        scanner.close();

        int sum = 0;
        for (int i = 0; i < spl.length; i++) {
            int currentVal = getValue(spl[i]);
            int nextVal = 0;

            if (i + 1 < spl.length){
                nextVal = getValue(spl[i + 1]);
            }

            if (currentVal < nextVal){
                sum -= currentVal;
            }else {
                sum += currentVal;
            }
        }
        System.out.println(sum);
    }

    public static int getValue(String symbol){
        return switch (symbol){
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}
