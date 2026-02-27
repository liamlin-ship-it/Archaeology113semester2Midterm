package Midterm;

import java.util.Scanner;

public class MidtermSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Length: " + calculateLength(input));
    }

    public static int calculateLength(String input){
        return input.length();
    }
}
