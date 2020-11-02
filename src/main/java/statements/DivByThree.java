package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number % 3 == 0 ? "Your number can be divided by 3" : "Your number can't be divided by 3");
    }
}
