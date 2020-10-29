package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Adjon meg két egész számot");
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + numberTwo);

    }
}
