package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Adja meg a nevét");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Adja meg az email címét");
        String email = scanner.nextLine();

        System.out.println("Username: " +name+ " " + "Email: " +email);
    }
}
