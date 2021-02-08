package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {
    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }
    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() {
        List<Book> copy = new ArrayList<>(library);
        Collections.reverse(copy);
        return copy;
    }
    public Book getFirstBook() {
        Book firstBook = library.get(0);
        for(Book e : library) {
            if(e.getId() < firstBook.getId()) {
               firstBook = e;
            }
        }
        return firstBook;
    }
    public Book getLastBook() {
        Book lastBook = library.get(0);
        for(Book e : library) {
            if(e.getId() > lastBook.getId()) {
                lastBook = e;
            }
        }
        return lastBook;
    }
}
