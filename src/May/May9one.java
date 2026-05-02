package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May9one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        while (true){
            String currentName = scanner.next();

            if (currentName.equals(".")) break;

            int currentPrice = scanner.nextInt();

            name.add(currentName);
            price.add(currentPrice);
        }

        String target = scanner.next();
        int index = name.indexOf(target);
        if (name.contains(target)){
            System.out.println("The price of Banana:" + price.get(index));
        }else {
            System.out.println(target + " not found");
        }
    }
}
