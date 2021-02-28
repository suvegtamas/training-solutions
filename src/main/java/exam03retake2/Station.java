package exam03retake2;

public class Station {
    private final String stationName;
    private final int stormLevel;

    public Station(String stationName, int stormLevel) {
        this.stationName = stationName;
        this.stormLevel = stormLevel;
    }

    public String getStationName() {
        return stationName;
    }

    public int getStormLevel() {
        return stormLevel;
    }

    @Override
    public String toString() {
        return stationName + " " + stormLevel;

    }
}
