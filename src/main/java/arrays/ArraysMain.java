package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }
    public List<String> daysOfWeek() {
        return Arrays.asList("Hetfo", "Kedd", "Szerda", "Csutortok", "Pentek", "Szombat", "Vasarnap");

    }

    public String multiplicationTableAsString(int size) {
        int[][] multiply = new int[size][size];
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                multiply[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiply);
    }
    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }
    public String wonLottery(int[] bet , int[] winner) {
        Arrays.sort(bet);
        Arrays.sort(winner);
        return Arrays.equals(bet, winner) ? "You won the lottery!" : "Maybe next time";
    }


    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();
        System.out.println(am.daysOfWeek());
        System.out.println(am.numberOfDaysAsString().toString());
        System.out.println(am.multiplicationTableAsString(4));
        System.out.println(am.sameTempValues(new double[]{1,2,3}, new double[]{1,2,3}));
        System.out.println(am.sameTempValues(new double[]{1,3}, new double[]{1,2,3}));
        System.out.println(am.wonLottery(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}));
        System.out.println(am.wonLottery(new int[]{1,2,3,4,5}, new int[]{1,2,3,5}));
    }
}
