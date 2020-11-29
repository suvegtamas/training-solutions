package algorithmsmax;

import java.util.List;

public class IntegerMaxCalculator {
    public int maxNumber(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int item : numbers) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
