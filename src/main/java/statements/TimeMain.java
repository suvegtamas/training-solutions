package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actual Hour:");
        int hour1 = scanner.nextInt();
        System.out.println("Actual Minutes:");
        int minutes1 = scanner.nextInt();
        System.out.println("Actual Seconds:");
        int seconds1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Other Hour:");
        int hour2 = scanner.nextInt();
        System.out.println("Other Minutes:");
        int minutes2 = scanner.nextInt();
        System.out.println("Other seconds:");
        int seconds2 = scanner.nextInt();
        scanner.nextLine();

       Time fullTime1 = new Time(hour1, minutes1, seconds1);
       Time fullTime2 = new Time(hour2, minutes2, seconds2);

        System.out.println(fullTime1.toString());
        System.out.println(fullTime1.getInMinutes());
        System.out.println(fullTime2.toString());
        System.out.println(fullTime2.getInSeconds());
        System.out.println(fullTime1.earlierThan(fullTime2));






    }
}
