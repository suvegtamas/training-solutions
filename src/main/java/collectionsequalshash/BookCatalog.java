package collectionsequalshash;

import java.util.*;

public class BookCatalog {
    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book b = new Book(title,author);
       if(books.contains(b)) {
           return b;
       }
        return null;
    }
    public Book findBook(List<Book> books, Book book) {
        if(books.contains(book)) {
            return book;
        }
        return null;
    }
    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> result = new HashSet<>();
        Collections.addAll(result, books);
        return result;
    }
}
