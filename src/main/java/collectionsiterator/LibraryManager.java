package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {
    private Set<Book> books = new HashSet<>();

    public LibraryManager(Set<Book> books) {
        this.books = books;
    }

    public Book findBookByRegNumber(int regNumber) {
        for(Iterator<Book> iterate = books.iterator(); iterate.hasNext();) {
            Book item = iterate.next();
            if(item.getRegNumber() == regNumber) {
                return item;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        for(Iterator<Book> iterate = books.iterator(); iterate.hasNext();) {
            Book item = iterate.next();
            if(item.getRegNumber() == regNumber) {
                books.remove(item);
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> result = new HashSet<>();
        for(Iterator<Book> iterate = books.iterator(); iterate.hasNext();) {
            Book item = iterate.next();
            if(item.getAuthor().equals(author)) {
                result.add(item);
            }
        }
        if(result.size() == 0) {
            throw new MissingBookException("No books found by " + author);
        }
        return result;
    }
    public int libraryBooksCount() {
        return books.size();
    }
}
