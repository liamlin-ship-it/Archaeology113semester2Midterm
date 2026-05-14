package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May29two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> contactList = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String phone = scanner.next();
            String city = scanner.next();

            HashMap<String, String> person = new HashMap<>();
            person.put("name", name);
            person.put("phone", phone);
            person.put("address", city);
            contactList.add(person);
        }

        String target = scanner.next();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            // Grab the current HashMap from the list
            HashMap<String, String> currentPerson = contactList.get(i);
            if (currentPerson.get("name").equals(target)){
                System.out.println("Name: " + currentPerson.get("name"));
                System.out.println("Phone: " + currentPerson.get("phone"));
                System.out.println("Address: " + currentPerson.get("address"));
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Contact not found");
        }
        scanner.close();
    }
}
