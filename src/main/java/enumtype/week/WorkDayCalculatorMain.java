package enumtype.week;

public class WorkDayCalculatorMain {
    public static void main(String[] args) {
        WorkDayCalculator work = new WorkDayCalculator();
        System.out.println(work.dayTypes(Day.FRIDAY, 7));
    }
}
