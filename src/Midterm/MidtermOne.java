package Midterm;

import java.util.Scanner;

public class MidtermOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[5];

        for (int i = 0; i < input.length; i++){
            input[i] = scanner.next();
        }

        int index = scanner.nextInt();
        String newInput = scanner.next();
        if (index < input.length && index >= 0){
            input[index] = newInput;
            for (String result : input){
                System.out.print(result + " ");
            }
        } else {
            System.out.println("Index is out of range!");
        }
    }
}
