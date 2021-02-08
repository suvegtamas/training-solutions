package week15d01;

import java.util.*;

public class MaxCoordFinder{
    private Map<Double,Double> coordinates = new HashMap<>();

    public MaxCoordFinder(Map<Double, Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Map.Entry<Double,Double> getMaxPositionAndValue() {
        Map.Entry<Double,Double> result = null;
        for(Map.Entry<Double,Double> entry : coordinates.entrySet()) {
            if(result == null || entry.getValue().compareTo(result.getValue()) > 0) {
                result = entry;
            }
        }



        return result;
    }

    public static void main(String[] args) {
        Map<Double,Double> result = Map.of(0.1,2.0,0.4,3.5,2.3,92.6);
        MaxCoordFinder mcf = new MaxCoordFinder(result);
        System.out.println(mcf.getMaxPositionAndValue());
    }
}
