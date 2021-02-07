package searching;

import java.util.Arrays;

public class BookArraySearch {
    private final Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if(isEmpty(title) || isEmpty(author)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        Book b = new Book(author,title);

        Arrays.sort(bookArray);

        int index = Arrays.binarySearch(bookArray,b);
        if(index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return bookArray[index];
    }

    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }
}
