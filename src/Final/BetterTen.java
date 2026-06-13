package Final;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BetterTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] num = new String[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.next();
            set.add(num[i]);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        for (String s : set){
            if (map.containsKey(s)){
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
