package introcontrol;

import java.util.Scanner;


public class BoatRental {
    public static void main(String[] args) {
        int boat1 = 5;
        int boat2 = 3;
        int boat3 = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a csapat letszamat?");
        int team = scanner.nextInt();

        int places = 10;
        int boats = 3;

        if (team > 3) {
            System.out.println("5-os csonak");
            team = team - 5;
            places--;
            places = places - 5;

        }
        if ( team > 2) {
            System.out.println("3-as csonak");
            team = team - 3;
            places--;
            places = places - 3;
        }
        if (team > 0) {
            System.out.println("2-es csonak");
            team = team - 2;
            places--;
            places = places - 2;
        }
        if ( team > 0) {
            System.out.println("Nincs tobb csonak");
        } else {
            System.out.println("Ures helyek:" + places);
            System.out.println("ures csonakok:" + boats);
        }
    }


}
