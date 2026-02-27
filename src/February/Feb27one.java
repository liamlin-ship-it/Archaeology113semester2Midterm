package February;

import java.util.Scanner;

public class Feb27one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score <= 59){
            System.out.println("Fail");
            System.out.println("Grade: F");
        }else if (score < 70){
            System.out.println("Pass");
            System.out.println("Grade: D");
        }else if (score < 80){
            System.out.println("Pass");
            System.out.println("Grade: C");
        }else if (score < 90){
            System.out.println("Pass");
            System.out.println("Grade: B");
        }else if (score <= 100){
            System.out.println("Pass");
            System.out.println("Grade: A");
        }
    }
}
