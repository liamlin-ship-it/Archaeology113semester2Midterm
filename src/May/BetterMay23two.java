package May;

import java.util.HashSet;
import java.util.Scanner;

public class BetterMay23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> nameList = new HashSet<>();
        HashSet<String> repeatList = new HashSet<>();

        String input = scanner.next();
        while (!input.equals("end")){

            // .add() returns false if theHashSet already
            // contains the specified element.
            // If it's a duplicate,
            // we add it to the repeatList.
            if (!nameList.add(input)){
                repeatList.add(input);
            }

            input = scanner.next();
        }

        System.out.println(repeatList.size() + " " + nameList.size());
        scanner.close();
    }
}
