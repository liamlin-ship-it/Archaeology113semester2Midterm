package March;

import java.util.Scanner;

public class Mar27two {
    public static void main(String[] args) {
        greetUser();
        farewellUser();
    }

    //we don't need to pass any data back to the main method
    public static void greetUser(){
        System.out.println("Hello! Welcome to the program.");
    }

    //we don't need to pass any data back to the main method
    public static void farewellUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Goodbye, " + name + "!");
    }
}
