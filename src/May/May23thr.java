package May;

import java.util.Scanner;

public class May23thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        String word = input.toLowerCase();

        char firstChar = word.charAt(0);
        String targetRow = "";
        // -1 means does not found
        if (row1.indexOf(firstChar) != -1){
            targetRow = row1;
        } else if (row2.indexOf(firstChar) != -1) {
            targetRow = row2;
        } else if (row3.indexOf(firstChar) != -1) {
            targetRow = row3;
        }

        boolean isSameRow = true;
        for (int i = 1; i < word.length(); i++) {
            if (targetRow.indexOf(input.charAt(i)) == -1){
                isSameRow = false;
                break;
            }
        }

        if (!isSameRow){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
