package methoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }
    public Time(Time time) {
        this.hours = time.hours;
        this.minutes= time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        if (this.hours == time.hours && this.minutes == time.minutes && this.seconds == time.seconds) {
            return true;
        }
        return false;
    }
    public boolean isEqual(int hours, int minutes, int seconds) {
        if ( this.hours == hours && this.minutes == minutes && this.seconds == seconds) {
            return true;
        }
        return false;

    }
    public boolean isEarlier(Time time) {
        if (this.hours < time.hours) {
            return true;
        }
        return false;
    }
    public boolean isEarlier(int hours, int minutes, int seconds) {
        if ( this.hours < hours) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  hours + ":" + minutes;
    }
}
