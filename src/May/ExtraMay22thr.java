// Based on Ma22thr add another Magazine class

package May;

// THE PARENT CLASS
class Product2 {
    // 'protected' means child classes are allowed to see and use these variables
    protected String title;
    protected int price;

    public Product2(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // A generic method to get product details
    public String getDetails() {
        return "Title: " + title + ", Price: $" + price;
    }
}

// INHERITANCE: The Book class extends Product
class Book2 extends Product2 {
    private final String author; // A unique trait just for Books

    public Book2(String title, int price, String author) {
        super(title, price); // 'super' calls the parent constructor!
        this.author = author;
    }

    // POLYMORPHISM: Override the parent's method to change its behavior
    @Override
    public String getDetails() {
        return super.getDetails() + ", Author: " + author;
    }
}

// INHERITANCE: The Magazine class also extends Product
class Magazine extends Product2 {
    private final int issueNumber; // A unique trait just for Magazines

    public Magazine(String title, int price, int issueNumber) {
        super(title, price); // Pass title and price up to the Product constructor
        this.issueNumber = issueNumber;
    }

    // POLYMORPHISM: We change the behavior for Magazines
    @Override
    public String getDetails() {
        return super.getDetails() + ", Issue #: " + issueNumber;
    }
}

public class ExtraMay22thr {
    public static void main(String[] args) {
        // POLYMORPHISM IN ACTION:
        // Notice the data type on the left is 'Product', but the actual
        // objects on the right are 'Book' and 'Magazine'!
        Product2 item1 = new Book2("Java Basics", 100, "Alice Smith");
        Product2 item2 = new Magazine("Tech Weekly", 15, 42);

        // When we call getDetails(), Java automatically knows which version to use.
        // It uses the Book's version for item1, and the Magazine's version for item2.
        System.out.println(item1.getDetails());
        System.out.println(item2.getDetails());
    }
}
