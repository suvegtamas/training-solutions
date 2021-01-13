package activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint other) {
        trackPoints.add(other);
    }
    public Coordinate findMinimumCoordinate() {
        double minLat = trackPoints.get(0).getCoordinate().getLatitude();
        double minLon = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint t : trackPoints) {
            if (t.getCoordinate().getLatitude() < minLat) {
                minLat = t.getCoordinate().getLatitude();
            }
            if (t.getCoordinate().getLongitude() < minLon ) {
                minLon = t.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLat,minLon);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLat = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLon = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint t : trackPoints) {
            if (t.getCoordinate().getLatitude() > maxLat) {
                maxLat = t.getCoordinate().getLatitude();
            }
            if (t.getCoordinate().getLongitude() > maxLon ) {
                maxLon = t.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLat,maxLon);
    }

    public double getDistance() {
        double totalDistance = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            totalDistance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
        }
        return totalDistance;
    }
    public double getFullDecrease() {
        double totalDecrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i-1).getElevation()) {
                totalDecrease += trackPoints.get(i-1).getElevation() -trackPoints.get(i).getElevation();
            }
        }
        return totalDecrease;
    }
    public double getFullElevation() {
        double totalElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i-1).getElevation()) {
                totalElevation += trackPoints.get(i).getElevation() - trackPoints.get(i-1).getElevation();
            }
        }
        return totalElevation;
    }
    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();
        double result = ((max.getLatitude() - min.getLatitude()) * (max.getLongitude() - min.getLongitude()));
        return result;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
