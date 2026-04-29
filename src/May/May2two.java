package May;

import java.util.Scanner;

class Student {
    private String name = "Unknown";
    private String id = "12156000";
    private int totalCredits = 0;

    // Writing two constructor is a better way
    // for flexibility in object creation
    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addCredits(int credits) {
        this.totalCredits += credits;
    }

    public void printId() {
        System.out.print(name + "'s student ID is " + id);
    }

    public int getCredits() {
        return totalCredits;
    }
}

public class May2two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String id = scanner.next();

        Student student = new Student(name, id);

        int credits = scanner.nextInt();
        while (credits != 0){
            student.addCredits(credits);
            credits = scanner.nextInt();
        }

        student.printId();
        System.out.println(", total credits: " + student.getCredits());
        scanner.close();
    }
}
