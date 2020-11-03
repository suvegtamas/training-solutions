package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Password:");
        String password1 = scanner.nextLine();

        System.out.println("Password Again:");
        String password2 = scanner.nextLine();
        UserValidator userValidator = new UserValidator();
        System.out.println(userValidator.isValidUsername(username) ? "Username correct" : "Username incorrect");
        System.out.println(userValidator.isValidPassword(password1,password2) ? "Password accepted" : "Password Denied");
        System.out.println(userValidator.isValidEmail(email) ? "Email correct" : "Email incorrect");
        

    }
}
