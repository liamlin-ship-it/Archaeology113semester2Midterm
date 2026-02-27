package March;

import java.util.Scanner;

public class Mar28thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] spl = input.split(" ");

        boolean found = false;
        for (String result : spl){
            if (result.length() >= 5){
                System.out.print(result + " ");
                found = true;
            }
        }

        if (!found){
            System.out.println("None");
        }
    }
}
