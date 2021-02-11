package week15d04;

public class Cases {
    private String week;
    private int cases;

    public Cases(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return week + " " + cases;

    }
}
