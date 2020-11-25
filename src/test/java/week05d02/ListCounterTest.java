package week05d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    void listCounterTest() {
        //Given
        ListCounter lc = new ListCounter();
       //When
        int result = lc.countElements(Arrays.asList("Argo", "Amber", "atlasz", "bunda"));
       //Then
        assertEquals(3, result);
    }
    @Test
    void listCounterIfNoElements() {
        assertEquals(0,new ListCounter().countElements(Arrays.asList()));
    }
    @Test
    void listCounterIfNotFoundElements() {
        assertEquals(0,new ListCounter().countElements(Arrays.asList("bunda", "buksi", "poukember")));
    }
}
