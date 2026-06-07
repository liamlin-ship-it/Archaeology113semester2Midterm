package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BetterMay29two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            HashMap<String, String> person = new HashMap<>();
            String name = scanner.next();
            String phone = scanner.next();
            String city = scanner.next();

            person.put("name", name);
            person.put("phone", phone);
            person.put("city", city);
            list.add(person);
        }

        String target = scanner.next();
        scanner.close();

        check(list, target);
    }

    public static void check(ArrayList<HashMap<String, String>> list, String target){
        boolean found = false;
        for (HashMap<String, String> currentPerson : list) {
            if (currentPerson.get("name").equals(target)) {
                System.out.println("Name: " + currentPerson.get("name"));
                System.out.println("Phone: " + currentPerson.get("phone"));
                System.out.println("Address: " + currentPerson.get("city"));
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Contact not found");
        }
    }
}
