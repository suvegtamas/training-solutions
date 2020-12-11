package constructoroverloading;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }
    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }
    public int toMinutes() {
        return hours * 60 + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time) {
        int inMinutesLocal = time.toMinutes();
        int inMinutesGlobal = this.toMinutes();
        return inMinutesGlobal - inMinutesLocal;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;

    }
}
