package defaultconstructor;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if ( year <= 1990 || month > 12 || month < 1 || day > 30) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! "
                    + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
