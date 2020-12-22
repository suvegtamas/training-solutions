package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {
    @Test
    void testFibSum() {
        FibCalculator f = new FibCalculator();
        assertEquals(2,f.sumEvens(5));
        assertEquals(44,f.sumEvens(10));

    }



}
