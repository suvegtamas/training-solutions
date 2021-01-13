package week11d02;

public class Ride {

    private int day;
    private int rideId;
    private int routeKm;

    public Ride(int day, int rideId, int routeKm) {
        this.day = day;
        this.rideId = rideId;
        this.routeKm = routeKm;
    }



    public int getDay() {
        return day;
    }

    public int getRideId() {
        return rideId;
    }

    public int getRouteKm() {
        return routeKm;
    }
}