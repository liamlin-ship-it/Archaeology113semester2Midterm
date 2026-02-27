package March;

import java.util.Scanner;

public class Mar27two {
    public static void main(String[] args) {
        greetUser();
        farewellUser();
    }

    public static void greetUser(){
        System.out.println("Hello! Welcome to the program.");
    }

    public static void farewellUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Goodbye, " + name + "!");
    }
}
