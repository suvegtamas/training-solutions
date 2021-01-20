package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        String problem = " 5 * (3 + 5) / 2";
        double answer = 5 * (3 + 5) / 2;

        System.out.println("Oldja meg a feladatot, mengengedett elteres 0.0001!");
        System.out.println("Feladat: " + problem);


        Scanner scanner = new Scanner(System.in);
        double answerUser = scanner.nextDouble();
        scanner.nextLine();

        if (Math.abs(answer - answerUser) < 0.0001) {
            System.out.println("Helyes valasz");
        } else {
            System.out.println("Helytelen valasz");
        }
    }
}
