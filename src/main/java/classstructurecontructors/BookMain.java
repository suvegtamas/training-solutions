package classstructurecontructors;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("J.K Rowling", "Harry Potter");
        book.register("1");

        System.out.println("Author:" + book.getAuthor());
        System.out.println("Title:" + book.getTitle());
        System.out.println("Reg Number: " + book.getRegNumber());
    }
}
