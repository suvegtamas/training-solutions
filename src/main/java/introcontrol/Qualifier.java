package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public String greaterThan(int number) {
        if (number>100) {
            return "Nagyobb, mint szaz";
        } else {
            return "Szaz, vagy kisebb";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy szamot:");
        int number = scanner.nextInt();
        Qualifier qualifier = new Qualifier();
        System.out.println(qualifier.greaterThan(number));
    }
}
