package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> title = new ArrayList<>();

    public void addTitle(String book) {
        title.add(book);
    }
    public List<String> findByPrefix(String prefix) {
        List<String> containsPrefix = new ArrayList<>();
         for ( String item : title) {
             if (item.startsWith(prefix)) {
                 containsPrefix.add(item);
             }
         }
            return containsPrefix;
    }
    public void removeByPrefix(String prefix) {
        List<String> removedByPrefix = new ArrayList<>();
        for ( String item : title) {
            if(item.startsWith(prefix)) {
                removedByPrefix.add(item);
            }

        } title.removeAll(removedByPrefix);
    }

    public List<String> getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Books books = new Books();
        System.out.println("Add new Title");
        books.addTitle("Harry Potter");
        books.addTitle("Harry Potter");
        books.addTitle("Harry Potter");
        books.addTitle("Kismalac");
        System.out.println("Current Titles");
        System.out.println(books.getTitle());

        System.out.println("Find By Prefix");
        System.out.println(books.findByPrefix("Harr"));

        books.removeByPrefix("Harr");
        System.out.println(books.getTitle());



    }
}
