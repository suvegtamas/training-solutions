package collectionscomp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        return author1.compareTo(author2);
    }
}

