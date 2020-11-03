package week02;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipus:");
        String type1 = scanner.nextLine();
        System.out.println("Mem:");
        int mem1 = scanner.nextInt();
        scanner.nextLine();

        Phone phone = new Phone(type1, mem1);
        System.out.println("Tipus:" + phone.getType() + " " +  "Mem:" + phone.getMem());

    }
}
