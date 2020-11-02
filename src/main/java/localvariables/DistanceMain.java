package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(56.2, false);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int dist = (int) distance.getDistanceInKm();
        System.out.println(dist);
    }
}
