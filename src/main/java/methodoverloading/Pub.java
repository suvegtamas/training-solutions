package methodoverloading;

public class Pub {
    private String name;
    private Time openFrom;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        openFrom = new Time(hours, minutes);
    }


    public String getName() {
        return name;
    }

    public Time getOpenFrom() {
        return openFrom;
    }


    @Override
    public String toString() {
        return name + ";" + openFrom;

    }
}