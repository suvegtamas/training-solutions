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
    @DisplayName("Negatives should throw exception.")
    @Test
    void negativesThrowsExceptionTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().greatestCommonDivisor(-1,3));
        assertEquals("We don't accept negative numbers.", ex.getMessage());
    }

}
