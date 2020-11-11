package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {

    @Test
    public void dayOfWeekTest() {
        //Given
        DayOfWeek day = new DayOfWeek();
        //When
        String days = day.dayOfWeek("hétfő");
        String days1 = day.dayOfWeek("szerda");
        String days2 = day.dayOfWeek("péntek");
        String days3 = day.dayOfWeek("szombat");
        //Then
        assertEquals(days,"hét eleje");
        assertEquals(days1,"hét közepe");
        assertEquals(days2,"majdnem hétvége");
        assertEquals(days3,"hét vége");
    }
}
