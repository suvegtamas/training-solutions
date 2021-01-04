package week10d01;

import java.util.Arrays;
import java.util.List;

public class Hiking {
    public double getPlusElevation(List<Double> heightList) {
        double sum = 0;
        for (int i = 1; i < heightList.size(); i++) {
            if (heightList.get(i) > heightList.get(i-1)) {
                sum += heightList.get(i) - heightList.get(i-1);
            }
        }
        return sum;
    }


}
