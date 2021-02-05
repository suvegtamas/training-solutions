package collectionslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
      private Random rnd = new Random();
    public List<Integer> selectWinningNumbers(int type, int ballCount) {
        if(ballCount <= type) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < type; i++) {
            result.add(rnd.nextInt(ballCount) + 1);
        }
        Collections.shuffle(result);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Lottery l = new Lottery();
        System.out.println(l.selectWinningNumbers(5,90));
    }
}
