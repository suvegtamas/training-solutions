package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    void testCreate() {
        assertFalse(new Lab("Interfesz").isCompleted());
        assertTrue(new Lab("Methods", LocalDateTime.of(2020,12,11 , 10 , 30 , 12)).isCompleted());
    }
    @Test
    void testComplete() {
        Lab lab =  new Lab("Methods");
        LocalDateTime time = LocalDateTime.of(2020,12,11 , 10 , 30 , 12);
        lab.complete(time);
        assertEquals(time, lab.getCompletedAt());
    }
    @Test
    void testComplete2() {
        Lab lab = new Lab("Methods");
        LocalDateTime time = LocalDateTime.now();
        lab.complete(time);
        assertEquals(time, lab.getCompletedAt());
    }
    @Test
    void toStringTest() {
        Lab lab = new Lab("Methods");
        String labStr = lab.toString();
        assertEquals("Lab{title='Methods', completed=false, completedAt=null}",labStr);
    }

    @Test
    void toStringTest2() {
        LocalDateTime time = LocalDateTime.of(2020,12,11 , 10 , 30 , 12);
        Lab lab = new Lab("Methods", time);
        String labStr = lab.toString();
        assertEquals("Lab{title='Methods', completed=true, completedAt=2020-12-11T10:30:12}",labStr);
    }

}
