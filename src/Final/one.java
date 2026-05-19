package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        ArrayList<String> scoreInputs = getScoreInput(5);
        ArrayList<Integer> validScores = validateScoreFormat(scoreInputs);

        calculateAndDisplayTotal(validScores);
    }

    // This helper method reads a specified number of score strings from the teacher
    public static ArrayList<String> getScoreInput(int numberOfScores) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> scoreInputs = new ArrayList<>();
        for (int i = 0; i < numberOfScores; i++) {
            String scoreInput = scanner.next();
            scoreInputs.add(scoreInput);
        }
        return scoreInputs;
    }

    // This helper method tries to validate score format and convert to integers
    public static ArrayList<Integer> validateScoreFormat(ArrayList<String> scoreStrings) {
        ArrayList<Integer> validScores = new ArrayList<>();
        for (String scoreStr : scoreStrings)
            try {
                validScores.add(Integer.parseInt(scoreStr));
            }catch (NumberFormatException except){
                System.out.println(scoreStr + " is not a valid score format");
            }
        return validScores;
    }

    // This helper method calculates the total score and prints the result
    public static void calculateAndDisplayTotal(ArrayList<Integer> scoreList) {
        int total = 0;
        for (int score : scoreList) {
            total += score;
        }
        System.out.println(total);
    }
}
