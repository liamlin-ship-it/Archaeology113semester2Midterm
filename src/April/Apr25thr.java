package April;

class Book{
    public String title;
    public String author;

    public Book(String initialTitle, String initialAuthor){
        this.title = initialTitle;
        this.author = initialAuthor;
    }
}

public class Apr25thr {
    public static void main(String[] args) {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien");
        System.out.print("Book: " + book.title + ", " + book.author);

        System.out.println();

        Book book1 = new Book("1984", "George Orwell");
        System.out.println("Book: " + book1.title + ", " + book1.author);
    }
}
