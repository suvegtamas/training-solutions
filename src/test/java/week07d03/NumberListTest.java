package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberListTest {
    @Test
    void testIncreasing() {
        NumberList nl = new NumberList();
        List<Integer> numbers = Arrays.asList(1, 2, 3 ,3 ,5);
        boolean result = nl.isIncreasing(numbers);
        assertEquals(true, result);
    
    }
    @Test
    void ifFalseTest() {
        NumberList nl = new NumberList();
        List<Integer> numbers = Arrays.asList(1, 4, 3 ,3 ,5);
        boolean result = nl.isIncreasing(numbers);
        assertFalse(result);
    }


}
