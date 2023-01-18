import java.util.*;
// BookMap class creates a HashMap of books and then sorts them by year in decreasing order.
public class BookMap {

    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();

        // Add books to the HashMap created

        books.put("Book1", new Book("The Mezzanine", 1988));
        books.put("Book2", new Book("The Last Illusion", 2014));
        books.put("Book3", new Book("Carrie", 1974));
        books.put("Book4", new Book("The Lord of the Rings", 1954));
        books.put("Book5", new Book("The Grapes of Wrath", 1939));

        // Convert the HashMap to a list so that it can be sorted
        List<Map.Entry<String, Book>> sortedBooks = new ArrayList<>(books.entrySet());

        // Sort the list of books by year in descending order using Collections.sort

        Collections.sort(sortedBooks, new Comparator<Map.Entry<String, Book>>() {
            public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
                return b2.getValue().getYear() - b1.getValue().getYear();
            }
        });
        // Print the sorted list of books
        for (Map.Entry<String, Book> book : sortedBooks) {
            System.out.println(book.getKey() + ": " + book.getValue().getName() + ", " + book.getValue().getYear());
        }
    }
        }

