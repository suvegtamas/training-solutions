package week04d02;

import java.util.Random;

public class GetIndex {
    public static void main(String[] args) {
        GetIndex gt = new GetIndex();
      final int i;
      i = 3;

    }
    public int randomBetween(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}
