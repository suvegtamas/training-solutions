package exam02;

import java.util.Collections;

public class ArraySelector {
    public String selectEvens(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        if (numbers.length == 0) {
            return "";
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sb.append(numbers[i]);
                sb.append(", ");
            }
        }
        return "[" + sb.toString() + "]";
    }

}
