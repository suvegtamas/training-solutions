package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {
    @Test
    void ifParameterIsNegative() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(-2));
        assertEquals("Parameter must be positive.", ex.getMessage());
    }
    @Test
    void ifIsPrime() {
        assertEquals(true, new MathAlgorithms().isPrime(29));
    }
    @Test
    void itsNotPrime() {
        assertEquals(false, new MathAlgorithms().isPrime(32));
    }
}
