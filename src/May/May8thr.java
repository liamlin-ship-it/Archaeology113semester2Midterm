package May;

import java.util.Scanner;

class Student2 {
    private final String name;
    private final String id;
    private final int[] scores;
    private int scoreCount;
    private final static String schoolName = "Technology University";

    public Student2(String name, String id) {
        this.name = name;
        this.id = id;
        this.scores = new int[10];
        this.scoreCount = 0;
    }

    public void addScore(int score) {
        if (!validScore(score)) {
            System.out.println("Invalid score: " + score + " (must be between 0 and 100)");
            return;
        }

        if (scoreCount < 10) {
            scores[scoreCount] = score;
            scoreCount++;
        } else {
            System.out.println("Cannot add more scores, maximum is 10");
        }
    }

    private boolean validScore(int score) {
        return score >= 0 && score <= 100;
    }

    public double calculateAverage() {
        if (scoreCount == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < scoreCount; i++) {
            sum += scores[i];
        }
        return (double) sum / scoreCount;
    }

    public String toString() {
        return schoolName + " Student - ID: " + id + ", Name: " + name +
                ", Average Score: " + String.format("%.2f", calculateAverage()) ;
    }
}

public class May8thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            int numScores = scanner.nextInt();
            // add 'scanner.nextLine();' when a Token Reader
            // (nextInt, next, etc.) is followed immediately
            // by a Line Reader (nextLine)
            scanner.nextLine();

            Student2 student = new Student2(name, id);

            for (int j = 0; j < numScores; j++) {
                int score = scanner.nextInt();
                student.addScore(score);
            }
            if (numScores > 0) {
                scanner.nextLine();
            }

            System.out.println(student);
        }

        scanner.close();
    }
}
