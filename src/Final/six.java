package Final;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private final String title;
    private final int quantity;

    public Book(String title, int quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String toString() {
        return "Book: " + title + ", Quantity: " + quantity;
    }
}

class InventoryManager {
    private final ArrayList<Book> books;

    public InventoryManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks() {
        if (books.isEmpty()){
            System.out.println("Empty");
        }else {
            for (Book book : books){
                System.out.println(book);
            }
        }
    }
}

public class six {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();

            if (input.equals(".")) break;

            try {
                String title = input.split(",")[0];
                int inventory = Integer.parseInt(input.split(",")[1]);
                inventoryManager.addBook(new Book(title, inventory));
            }catch (Exception e){
                // ignore exception
            }
        }

        inventoryManager.printAllBooks();
    }
}
