package filescanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> booksList = new ArrayList<>();

    public void loadFromFile() {
        try(Scanner sc = new Scanner(Library.class.getResourceAsStream("/library.txt"))) {
            sc.useDelimiter(";|(\r\n)|\n");
            while(sc.hasNextLine()) {
                String regNum = sc.next();
                String author = sc.next();
                String title = sc.next();
                int yearOfPublish = sc.nextInt();
                booksList.add(new Book(regNum, author, title, yearOfPublish));
            }
        }



    }
    public List<Book> getBooks() {
        return booksList;
    }
}
