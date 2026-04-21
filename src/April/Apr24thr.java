package April;

import java.util.Scanner;

public class Apr24thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Area: " + calculateArea(length));
    }

    public static int calculateArea(int length){
        return length * length;
    }
}
