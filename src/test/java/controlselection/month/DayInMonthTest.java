package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {

    @Test
    public void dayInMonthTest() {
        //Given
        DayInMonth dayInMonth = new DayInMonth();
        //When
        int day = dayInMonth.DayInMonth(2020, "február");
        int day2 = dayInMonth.DayInMonth(2021, "február");
        int day3 = dayInMonth.DayInMonth(2023, "június");
        int day4 = dayInMonth.DayInMonth(2022, "december");

        //Then
        assertEquals(day,29);
        assertEquals(day2,28);
        assertEquals(day3,30);
        assertEquals(day4,31);
    }
}
