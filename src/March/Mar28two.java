package March;

import java.util.Scanner;

public class Mar28two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            //Get the value of the current character
            int currentVal = getValue(input.charAt(i));

            //Check if there is a next value to compare with
            int nextVal = 0;
            if (i + 1 < input.length()){
                nextVal = getValue(input.charAt(i + 1));
            }

            //If current value is smaller than the next value, it means subtraction.
            if (currentVal < nextVal){
                sum -= currentVal;
            }else {
                //Otherwise, it is normal addition.
                sum += currentVal;
            }
        }
        System.out.println(sum);
    }

    public static int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
            //return switch (ch) {
            //    case 'I' -> 1;
            //    case 'V' -> 5;
            //    case 'X' -> 10;
            //    case 'L' -> 50;
            //    case 'C' -> 100;
            //    case 'D' -> 500;
            //    case 'M' -> 1000;
            //    default  -> 0;
            //};
        }
    }
}
