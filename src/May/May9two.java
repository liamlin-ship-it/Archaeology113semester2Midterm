package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May9two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true){
            int n = scanner.nextInt();

            if (n == 1){
                String name = scanner.next();
                nameList.add(name);
            } else if (n == 2) {
                String name = scanner.next();
                nameList.remove(name);
            } else if (n == 3) {
                break;
            } else {
                System.out.println("not a valid choice");
            }
        }

        for (String element : nameList){
            System.out.println(element);
        }
    }
}
