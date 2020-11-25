package week05d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {
    private static final String FIRST_LETTER = "A";

    public int countElements(List<String> elements) {
        int count = 0;
        for (String item : elements) {
            if (item.startsWith(FIRST_LETTER) || item.startsWith(FIRST_LETTER.toLowerCase())) {
                count++;
            }

        }
        return count;
    }

}
