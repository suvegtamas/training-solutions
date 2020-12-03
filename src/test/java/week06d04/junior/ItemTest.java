package week06d04.junior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest {
    @Test
     void ifNameIsWrongTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item("", 2, 3));
        assertEquals("Name must be given",ex.getMessage());
    }
    @Test
    void ifMonthIsIncorrect() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item("test1", 13, 12));
        assertEquals("Month has to be between 1-12", ex.getMessage());
    }
    @Test
    void ifPriceIsNegative() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item("test1", 2, -12));
        assertEquals("Price can't be negative.", ex.getMessage());
    }

}
