package May;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private final String title;
    private final int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Price: " + price;
    }
}

class BookStore {
    private final ArrayList<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public Book find(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

public class Mat22thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        BookStore bookStore = new BookStore();

        for (int i = 0; i < n; i++) {
            String title = scanner.next();
            int price = scanner.nextInt();
            Book book = new Book(title, price);
            bookStore.add(book);
        }

        String target = scanner.next();

        if (bookStore.find(target) != null){
            System.out.println(bookStore.find(target));
        } else {
            System.out.println("The book is not in the store.");
        }
    }
}
