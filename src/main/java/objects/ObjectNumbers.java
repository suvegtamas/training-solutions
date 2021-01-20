package objects;

public class ObjectNumbers {
    public static void main(String[] args) {
        Books book1 = new Books();
        Books book2 = new Books();
        Books book3 = new Books();
        Books book4 = book1;
        Books book5 = book1;
        Books book6 = book3;
        Books book7 = null;
        book4 = book5;
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);

        System.out.println("3 Objektum, 3 memoria cim");
        System.out.println("--------------------------------------");

        book5 = new Books();
        book6 = null;

        System.out.println(book5);
        System.out.println(book6);

        System.out.println("4 objektum, 4 memoria cim");

    }
}
