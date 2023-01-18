/*Create a class called Book that has name and year. In a new class, create a HashMap that store at least 5 different books.
Then sort it use Collections.sort method based on years in decreasing order.
 */

// Book class defines the object type Book, which contains a name and a year.
public class Book {
    private String name;
    private int year;

    // Constructor for Book objects
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Getter for the name of this book
    public String getName() {
        return name;
    }
    // Getter for the year of this book
    public int getYear() {
        return year;
    }
}
