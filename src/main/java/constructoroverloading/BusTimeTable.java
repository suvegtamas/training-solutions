package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }
    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> newTimeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            newTimeTable.add(new SimpleTime(i, everyMinute));
        }
        timeTable = newTimeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }
    public SimpleTime nextBus(SimpleTime actual) {
        for ( int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).difference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
    public SimpleTime firstBus() {
        SimpleTime first = timeTable.get(0);
        for (int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).toMinutes() < first.toMinutes()) {
                first = timeTable.get(i);
            }
        }
        return first;
    }
}

