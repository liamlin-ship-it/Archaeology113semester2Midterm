package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May29one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> friends = new ArrayList<>();

        HashMap<String, String> person1 = new HashMap<>();
        person1.put("name", "John");
        person1.put("age", "30");
        person1.put("city", "New York");
        friends.add(person1);

        HashMap<String, String> person2 = new HashMap<>();
        person2.put("name", "Alice");
        person2.put("age", "25");
        person2.put("city", "Los Angeles");
        friends.add(person2);

        String searchName = scanner.next();
        String searchField = scanner.next();

        boolean friendFound = false;
        for (HashMap<String, String> friend : friends){
            if (friend.get("name").equals(searchName)){
                friendFound = true;

                if (friend.containsKey(searchField)) {
                    System.out.println(searchName + "'s " + searchField + " is " + friend.get(searchField));
                }else {
                    System.out.println("Invalid field");
                }
                break;
            }
        }

        if (!friendFound){
            System.out.println("Friend not found");
        }
        scanner.close();
    }
}
