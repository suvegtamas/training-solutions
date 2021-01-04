package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test
    public void testElevation() {
        Hiking hiking = new Hiking();
        double result = hiking.getPlusElevation(Arrays.asList(10D,20D,15D,18D));
        assertEquals(13.0,result);
    }
}
