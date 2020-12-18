package week08d05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {
    @DisplayName("Greatest common divisor.")
    @Test
    void mathTest() {
        assertEquals(6,new MathAlgorithms().greatestCommonDivisor(6,24));
    }
   @DisplayName("Division by 0 not allowed.")
    @Test
    void zeroDivisorMustThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().greatestCommonDivisor(0,3));
        assertEquals("Division by 0.", ex.getMessage());
    }
}
