package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        System.out.println("Guess the number game!");
        System.out.println("Are you ready? [yes/no]");
        Scanner scanner = new Scanner(System.in);
        String userReady = scanner.nextLine();
        if (userReady.equals("yes")) {
            System.out.println("Pick a number, and find out if you're right:");
        } else {
            System.out.println("Thank you for playing");
        }
        Random rnd = new Random();
        int compNumber = rnd.nextInt(101);
        int userNumber = 0;
        int count = 0;
        while (userNumber != compNumber) {
            userNumber = scanner.nextInt();
            if (userNumber == compNumber) {
                System.out.println("You won!");

            } else if (userNumber > compNumber){
                System.out.println("My number is lower");
            } else if ( userNumber < compNumber) {
                System.out.println("My number is bigger");
            }

        }

    }
}
