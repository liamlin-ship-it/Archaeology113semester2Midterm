package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May16thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> bookList = new ArrayList<>();

        while (scanner.hasNextLine()){
            String book = scanner.nextLine();
            if (book.equals(".")) break;
            String author = scanner.nextLine();

            HashMap<String, String> currentNumber = new HashMap<>();
            currentNumber.put("book", book);
            currentNumber.put("author", author);
            bookList.add(currentNumber);
        }

        for (HashMap<String, String> oneBook : bookList) {
            System.out.println("Book: " + oneBook.get("book"));
            System.out.println("Author: " + oneBook.get("author"));
            System.out.println();
        }
    }
}
