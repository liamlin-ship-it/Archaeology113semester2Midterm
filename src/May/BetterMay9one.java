package May;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterMay9one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> priceList = new ArrayList<>();

        while (scanner.hasNext()){
            String item = scanner.next();
            if (item.equals(".")) break;
            int price = scanner.nextInt();

            itemList.add(item);
            priceList.add(price);
        }

        String target = scanner.next();

        System.out.println(check(itemList, priceList, target));
    }

    public static String check(ArrayList<String> itemList, ArrayList<Integer> priceList, String target){
        if (itemList.contains(target)){
            return "The price of Banana:" + priceList.get(itemList.indexOf(target));
        }else {
            return target + " not found";
        }
    }
}
