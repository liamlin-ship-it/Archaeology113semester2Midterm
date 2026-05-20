package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        ArrayList<String> inputList = getUserInput();

        // Try to convert each string and print the results
        String studentID = buildStudentID(inputList);
        System.out.println(studentID);
    }

    // This helper method reads a specified number of strings from the user
    public static ArrayList<String> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String input = scanner.next();
            inputList.add(input);
        }

        return inputList;
    }

    // This method builds a student ID from a list of strings
    public static String buildStudentID(ArrayList<String> strList) {
        // Concatenate the numbers from the list
        String studentID = "";

        for (String str : strList) {
            // Convert the string to an integer and format it with leading zeros
            try {
                int num = Integer.parseInt(str);
                studentID += String.format("%04d", num);
            }catch (NumberFormatException except){
                return "Invalid input";
            }
        }

        return studentID;
    }
}
