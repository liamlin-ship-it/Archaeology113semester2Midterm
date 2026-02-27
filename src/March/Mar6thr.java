package March;

import java.util.Scanner;

public class Mar6thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] spl = input.split(" ");

        for (String reverse : spl){
            StringBuilder sb = new StringBuilder(reverse).reverse();
            System.out.print(sb + " ");
        }
    }
}
