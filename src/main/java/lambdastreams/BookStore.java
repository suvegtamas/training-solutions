package lambdastreams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return books.stream().map(b -> b.getAmount()).reduce(0,(b1,b2) -> b1+b2);
    }


    public Optional<Book> findNewestBook() {
        return books.stream().max(Comparator.comparing(Book::getYearOfPublish));
    }

    public int getTotalValue() {
        return books.stream().mapToInt(b -> b.getPrice() * b.getAmount()).sum();
    }

    public List<Book> getByYearOfPublish(int year) {
        return books.stream().collect(Collectors.groupingBy(Book::getYearOfPublish)).get(year);
    }


    public List<Book> getBooks() {
        return books;
    }
}
