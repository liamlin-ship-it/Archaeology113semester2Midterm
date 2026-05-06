package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May15thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        String input = scanner.nextLine();
        String[] part = input.split(" ");
        for (String name : part){
            nameList.add(name);
        }

        String target = scanner.next();
        if (nameList.contains(target)){
            System.out.println(target + " is at index " + nameList.indexOf(target));
        }else {
            System.out.println(target + " is not in the list.");
        }
    }
}
