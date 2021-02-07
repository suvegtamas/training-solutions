package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {
    private final List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> result = new ArrayList<>(libraryBooks);
        result.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return result;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> result = new ArrayList<>();
        for(Book e : libraryBooks) {
            result.add(e.getTitle());
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance(locale).compare(o1,o2);
            }
        });
        return result;
    }

    public List<Book> orderedByAuthor() {
        List<Book> result = new ArrayList<>(libraryBooks);
        Collections.sort(result,new AuthorComparator());
        return result;
    }

}
