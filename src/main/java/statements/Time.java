package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        int inMinutes = 60;
        return hours*inMinutes + minutes;
    }

    public int getInSeconds() {
        int inSeconds = 60;
        return getInMinutes() * inSeconds + seconds;
    }
    public boolean earlierThan(Time other) {
        int actualTimeSeconds = this.getInSeconds();
        int otherTimeSeconds = other.getInSeconds();
        return actualTimeSeconds < otherTimeSeconds;

    }
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
