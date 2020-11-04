package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"Hetfo", "Kedd", "Szerda", "Csutortok", "Pentek", "Szombat", "Vasarnap"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] * 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        boolean[] bool = {true, false, true, false, true, false};
        bool[0] = false;

        for (int i = 0; i < bool.length; i++) {
            System.out.println(bool[i]);
        }

    }
}
