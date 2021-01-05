package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> busStops) {
        int[] counters = new int[30];
        int count = 0;
        for (int i : busStops) {
            counters[i]++;
        }
        int index = 0;
        for (int i = 0; i < counters.length;i++) {
            if ( counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }


}
