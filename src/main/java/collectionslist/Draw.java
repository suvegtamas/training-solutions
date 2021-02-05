package collectionslist;

import java.util.*;

public class Draw {
    public List<Integer> createNumbers(int maxNumber) {
        List<Integer> result = new LinkedList<>();
        for(int i = 1; i < maxNumber; i++) {
            result.add(i);
        }
        Collections.shuffle(result);
        return result;
    }
    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if(maxNumber <= drawCount) {
            throw new IllegalArgumentException("drawCount must be less then 8!");
        }

        return new TreeSet<>(createNumbers(maxNumber)) ;
    }
}
