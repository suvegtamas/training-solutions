package objects;

import classstructureconstructors.Book;

public class ObjectsMain {
    public static void main(String[] args) {
        new Books();

        System.out.println(new Books());

        Book emptyBook = null;
        System.out.println(emptyBook);

        if ( emptyBook == null) {
            System.out.println("emptyBook is null");
        }
        Books book = new Books();
        System.out.println(book);

        book = null;

        System.out.println(book);

        book = new Books();
        System.out.println(book);

        Books anotherBook = new Books();

        boolean checkBooks = book == anotherBook ? true : false;
        System.out.println(checkBooks);

        anotherBook = book;

        boolean checkBooks2 = book == anotherBook ? true : false;
        System.out.println(checkBooks2);

        System.out.println(anotherBook instanceof Books);


    }
}
