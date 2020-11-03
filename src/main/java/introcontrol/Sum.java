package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg ot szamot");
    int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Adja meg az " + (i+1) + " szamot");
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Sum:" +sum);
    }
}
