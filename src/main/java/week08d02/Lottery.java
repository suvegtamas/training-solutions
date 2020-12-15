package week08d02;

import java.util.*;

public class Lottery {

    Random rnd = new Random();
    List<Integer> numbers = new ArrayList<>();
    //--------------------------------------------------------------------------------------------------------------------
    // Generates lottery numbers, randomly , and sorted. (Index out of bounds exception not resolved).
    public List<Integer> getNumbers() {
        while ( numbers.size() != 5) {
            numbers.add(rnd.nextInt(90) + 1);
            removeIfInList(rnd.nextInt(90) + 1);
        }
        Collections.sort(numbers);
        return numbers;
    }
    //---------------------------------------------------------------------------------------------------------------------
    // Removes the number if the list contains it twice.
    public void removeIfInList(int number) {
        for (Integer i : numbers) {
            if (i == number) {
                i = rnd.nextInt(90) + 1;
            }
        }
    }


    //*****************************************************************************************************************************
    // Run the program
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        List<Integer> winner = lottery.getNumbers();
        System.out.println(winner);
    }

    // Exercise DOC!

    /* Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers() metódusa, ami visszaad
    egy listát amiben 5 véletlen szám van 1-90 között, tehát kvázi készíts egy lottósorsoló programot. A sorrendre
    nem kell figyelni, a lényeg, hogy a számok különbözők legyenek!  */
}
