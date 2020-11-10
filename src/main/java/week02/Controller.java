package week02;

import java.util.Scanner;

public class Controller {
   

    public void readOffice() {
        Office office = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a targyalok szamat:");

        int meetingRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < meetingRooms; i++) {
            System.out.println("Targyalo neve:");
            String name = scanner.nextLine();

            System.out.println("Targyalo szelessege:");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Targyalo hossza:");
            int length = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name,width,length);
            office.addMeetingRoom(meetingRoom);
        }


    }
    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valasszon egy menupontot");
        int choosenNum = scanner.nextInt();
        scanner.nextLine();

        if(choosenNum == 1) {
            office.printNames();
        }
        if (choosenNum == 2) {
            office.printNamesReverse();
        }
        if(choosenNum == 3) {
            office.printEventNames();
        }
        if(choosenNum == 4) {
            office.printAreas();
        }
        if (choosenNum == 5) {
            System.out.println("Milyen nev alapjan keres?");
            String name = scanner.nextLine();

            office.printMeetingRoomsWithName(name);
        }
        if(choosenNum == 6) {
            System.out.println("Adja meg a nev toredeket:");
            String part = scanner.nextLine();

            office.printMeetingRoomsContains(part);
        }
        if(choosenNum == 7) {
            System.out.println("Nagyobb mint:");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(area);
        }

    }
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
