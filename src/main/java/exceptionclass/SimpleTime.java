package exceptionclass;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (hour > 23 || hour < 0) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute > 59 || minute < 0) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time) {
        //Exceptions if time is null or the format is incorrect.
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!time.contains(":")) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int hourStr;
        int minStr;

        try {
            String[] timeSplit = time.split(":");
            hourStr = Integer.parseInt(timeSplit[0]);
            minStr = Integer.parseInt(timeSplit[1]);
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }



        // Exceptions if time is wrong
        if ( hourStr > 23 || hourStr < 0) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minStr > 59 || minStr < 0) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }

        this.hour = hourStr;
        this.minute = minStr;
    }



    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        if (hour < 10) {
            return String.format("0%d:%d",hour,minute);
        }
        if (minute < 10) {
            return String.format("%d:0%d",hour,minute);
        }
        return hour + ":" + minute;
    }
}
