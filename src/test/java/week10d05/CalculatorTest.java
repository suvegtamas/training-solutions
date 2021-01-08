package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSum() {
        Calculator calculator = new Calculator();
        int result = calculator.findMinSum(new int[]{1,3,4,5,6,7});
        assertEquals(13,result);
    }
}