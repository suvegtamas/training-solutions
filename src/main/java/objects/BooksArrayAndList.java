package objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksArrayAndList {
    public static void main(String[] args) {
        Books book1 = new Books();
        Books book2 = new Books();
        Books book3 = new Books();

        Books[] books = {book1, book2, book3};
        System.out.println(books);

        List<Books> booksList = Arrays.asList(book1, book2, book3);
        System.out.println(booksList);

        List<Books> emptyList = new ArrayList<>();
        emptyList.add(book1);
        emptyList.add(book2);
        emptyList.add(book3);
        System.out.println(emptyList);
    }




}





