package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("HP");
        System.out.println(book.getTitle());

        book.setTitle("Deathly Hallows");
        System.out.println(book.getTitle());
    }


}
