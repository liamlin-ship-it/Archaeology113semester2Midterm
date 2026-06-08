package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class sev {
    public static void main(String[] args) {
        ArrayList<HashSet<String>> clubList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            HashSet<String> members = new HashSet<>();
            Collections.addAll(members, scanner.nextLine().split(","));
            clubList.add(members);
        }

        String studentToRemove = scanner.nextLine();

        clubList.removeIf(club -> club.contains(studentToRemove));

        if (!clubList.isEmpty()) {
            displaySortedMembers(clubList.getFirst());
            displaySortedMembers(clubList.getLast());
        } else {
            System.out.println("Empty");
        }
    }

    public static void displaySortedMembers(HashSet<String> members) {
        ArrayList<String> sortedMembers = new ArrayList<>(members);
        sortedMembers.sort(null);
        System.out.println(String.join(",", sortedMembers));
    }
}
