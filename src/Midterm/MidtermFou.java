package Midterm;

import java.util.Scanner;

public class MidtermFou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int midterm = scanner.nextInt();
        double finalExam = scanner.nextDouble();

        String grade = calculateGrade(midterm, finalExam);
        System.out.println(grade);
    }

    public static String calculateGrade(int midterm, double finalExam){
        double grade = Math.round(midterm * 0.4 + finalExam * 0.6);
        String result;

        if (grade >= 90){
            result = "A";
        } else if (grade >= 80) {
            result = "B";
        } else if (grade >= 70) {
            result = "C";
        } else if (grade >= 60) {
            result = "D";
        }else {
            result = "F";
        }
        return result;
    }
}
