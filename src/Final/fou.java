package Final;

import java.util.*;

public class fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> books = BookCollector.getInputData(scanner, 5);

        // Get the field name to count values
        String category = scanner.next();

        scanner.close();

        // Create an instance of BookAnalyzer and count values in a specific field
        BookAnalyzer analyzer = new BookAnalyzer(books);
        HashMap<String, Integer> result = analyzer.countValues(category);

        // Sort the result by key and print it
        Object[] keys = result.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.println(key + ": " + result.get((String) key));
        }
    }
}

class BookCollector {
    // Static method to get input data from the user
    public static ArrayList<HashMap<String, String>> getInputData(Scanner scanner, int numberOfBooks) {
        ArrayList<HashMap<String, String>> books = new ArrayList<>();
        for (int i = 0; i < numberOfBooks; i++) {
            HashMap<String, String> book = new HashMap<>();
            String title = scanner.next();
            String author = scanner.next();
            String genre = scanner.next();
            book.put("title", title);
            book.put("author", author);
            book.put("genre", genre);
            books.add(book);
        }
        return books;
    }
}

class BookAnalyzer {
    private final ArrayList<HashMap<String, String>> books;

    // Constructor to initialize books
    public BookAnalyzer(ArrayList<HashMap<String, String>> books) {
        this.books = books;
    }

    public HashMap<String, Integer> countValues(String category){
        HashMap<String, Integer> results = new HashMap<>();

        for (HashMap<String, String> book : books){
            if (book.containsKey(category)){
                String targetValue = book.get(category);
                results.put(targetValue, results.getOrDefault(targetValue, 0) + 1);
            }
        }
        return results;
    }
}
