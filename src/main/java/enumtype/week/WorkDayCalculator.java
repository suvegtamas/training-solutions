package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkDayCalculator {
    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dayTypes = new ArrayList<>();
        Day day1 = firstDay;
        for (int i = 0; i < numberOfDays; i++) {
            dayTypes.add(day1.getDayType());
            day1 = nextDay(day1);
        }
        return dayTypes;
    }
    public Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }

    }
}
