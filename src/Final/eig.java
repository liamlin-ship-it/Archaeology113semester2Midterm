package Final;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class eig {
    public static void main(String[] args) {
        ArrayList<HashSet<String>> activityLists = new ArrayList<>();

        // Read input data, split by comma, and store in HashSet
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            HashSet<String> activities = new HashSet<>();
            for (String activity : scanner.nextLine().split(",")) {
                activities.add(activity);
            }
            activityLists.add(activities);
        }

        // Read the values to remove
        HashSet<String> cancelledActivities = new HashSet<>();
        // MRead the cancelled activities from input
        String[] activitiesToCancel = scanner.nextLine().split(",");
        for (String s : activitiesToCancel) {
            cancelledActivities.add(s);
        }

        // Merge all sets but the one with the value to remove
        HashSet<String> finalActivities = combineActivitiesExceptCancelled(activityLists, cancelledActivities);

        // Show the merged set
        if (finalActivities.isEmpty()) {
            System.out.println("Empty");
        } else {
            displaySortedActivities(finalActivities);
        }
    }

    private static HashSet<String> combineActivitiesExceptCancelled(ArrayList<HashSet<String>> activityLists, HashSet<String> cancelledActivities) {
        HashSet<String> result = new HashSet<>();

        // Add all the course to result,
        // then remove cancelledActivities
        for (HashSet<String> activityList : activityLists) {
            result.addAll(activityList);
        }
        result.removeAll(cancelledActivities);
        return result;
    }

    public static void displaySortedActivities(HashSet<String> activities) {
        ArrayList<String> sortedActivities = new ArrayList<>(activities);
        sortedActivities.sort(null);
        System.out.println(String.join(",", sortedActivities));
    }
}
