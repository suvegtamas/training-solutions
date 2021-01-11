package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisors() {
        DivisorFinder divisorFinder = new DivisorFinder();
        int result = divisorFinder.findDivisors(425);
        assertEquals(1,result);
    }
    @Test
    void divisionByZeroThrowsException() {
        Exception ex = assertThrows(IllegalStateException.class, () -> new DivisorFinder().findDivisors(0));
        assertEquals("Division by 0 no allowed",ex.getMessage());
    }

}