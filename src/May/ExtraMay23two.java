// Based on BetterMay23two,
// but use HashMap instead of HashSet

package May;

import java.util.HashMap;
import java.util.Scanner;

public class ExtraMay23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nameCount = new HashMap<>();

        String name = scanner.next();
        while (!name.equals("end")){
            //If the name isn't in the map yet, it returns 0.
            int currentCount = nameCount.getOrDefault(name, 0);
            // Then we add 1 to that count and update the map.
            nameCount.put(name, currentCount + 1);
            name = scanner.next();
        }

        int repeatCount = 0;
        for (int count : nameCount.values()){
            if (count > 1){
                repeatCount++;
            }
        }

        System.out.println(repeatCount + " " + nameCount.size());
        scanner.close();
    }
}
