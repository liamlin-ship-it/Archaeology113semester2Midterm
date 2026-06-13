package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] num = new String[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.next();
            list.add(num[i]);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        for (String s : list){
            if (map.containsKey(s)){
                System.out.println(s + " " + map.get(s));
                // after printing 's', delete it,
                // so it won't check 's' next time!
                map.remove(s);
            }
        }
    }
}
