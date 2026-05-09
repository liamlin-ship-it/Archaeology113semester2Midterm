package May;

import java.util.HashMap;
import java.util.Scanner;

public class May22two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();

        int n = scanner.nextInt();
        String[] product = new String[n];
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            product[i] = scanner.next();
            price[i] = scanner.nextInt();
            list.put(product[i], price[i]);
        }

        String target = scanner.next();
        System.out.println(check(list, target));
        scanner.close();
    }

    public static String check(HashMap<String, Integer> list, String target){
        return list.containsKey(target) ? "Found: " + target : "Not found: " + target;
    }
}
