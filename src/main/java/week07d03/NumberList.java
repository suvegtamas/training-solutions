package week07d03;

import java.util.Arrays;
import java.util.List;

public class NumberList {
    public boolean isIncreasing(List<Integer> numbers) {
        boolean result = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i+1)) {
                result = false;
            }
        }
        return result;
    }

}
