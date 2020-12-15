package week08d02;

import java.util.*;

public class Lottery {

    Random rnd = new Random();
    List<Integer> numbers = new ArrayList<>();
    //--------------------------------------------------------------------------------------------------------------------
    // Generates lottery numbers, randomly , and sorted. (Index out of bounds exception not resolved).
    public List<Integer> getNumbers() {
        while ( numbers.size() != 5) {
            int n = rnd.nextInt(90) + 1;
           if ( !numbers.contains(n)) {
               numbers.add(n);
           }
        }
        Collections.sort(numbers);
        return numbers;
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
