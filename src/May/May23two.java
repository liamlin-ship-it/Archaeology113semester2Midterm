package May;

import java.util.HashSet;
import java.util.Scanner;

public class May23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> nameList = new HashSet<>();
        HashSet<String> repeatList = new HashSet<>();

        String name = scanner.next();
        while (!name.equals("end")){
            boolean isNew = nameList.add(name);

            if (!isNew){
                repeatList.add(name);
            }
            nameList.add(name);
            name = scanner.next();
        }

        System.out.println(repeatList.size() + " " + nameList.size());
    }
}
