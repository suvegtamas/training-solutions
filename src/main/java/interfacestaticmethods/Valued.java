package interfacestaticmethods;

import java.util.List;

public interface Valued {
    double getValue();

    static double sum(List<Valued> valued) {
        double sum = 0;
        for (Valued v : valued) {
            sum += v.getValue();
        }
        return sum;
    }
}
