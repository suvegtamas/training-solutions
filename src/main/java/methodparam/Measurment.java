package methodparam;

public class Measurment {
    private double[] measurements;

    public Measurment(double[] measurements) {
        this.measurements = measurements;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < measurements.length; i++) {
            if (lower < measurements[i] && measurements[i] < upper) {
                return i;
            }
        }
        return -1;
    }
    public double minimum() {
        double min = measurements[0];
        for (int i = 0; i < measurements.length; i++) {
            if (measurements[i] < min) {
                min = measurements[i];
            }
        }
        return min;
    }
    public double maximum() {
        double max = measurements[0];
        for (int i = 0; i < measurements.length; i++) {
            if ( measurements[i] > max) {
                max = measurements[i];
            }
        }
        return max;
    }
    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
