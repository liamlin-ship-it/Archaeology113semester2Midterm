package May;

import java.util.HashMap;
import java.util.Scanner;

public class May16one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();

        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            if (input.equals("end")) break;

            list.put(input, check(input, list));
        }

        System.out.println(list);
        scanner.close();
    }

    public static int check(String input, HashMap<String, Integer> list){
        // When the book has occurred, it ignores the 0 entirely.
        // It grabs the actual current number.
        return list.getOrDefault(input, 0) + 1;
    }
}
