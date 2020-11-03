package introcontrol;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("1. Felhasznalok listazasa");
        System.out.println("2. Felhasznalo felvetele");
        System.out.println("Tobbi: Kilepes");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Felhasznalok listazasa");
        }
        if (option == 2) {
            System.out.println("Felhasznalo felvetele");
        }

    }
}
