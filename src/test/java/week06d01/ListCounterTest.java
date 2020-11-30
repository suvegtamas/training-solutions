package week06d01;

import org.junit.jupiter.api.Test;
import week05d03.ListCounter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListCounterTest {
    @Test
    void listIfHasElements() {
        assertEquals("[ace]", new ListSelector().getElements(Arrays.asList("a","b","c","d","e","f")));
    }
    @Test
    void listIfEmptyString() {
        assertEquals(" ",new ListSelector().getElements(Arrays.asList()));
    }
    @Test
    void listIsNull() {
        assertThrows(NullPointerException.class, () -> new ListSelector().getElements(null));
    }
}
