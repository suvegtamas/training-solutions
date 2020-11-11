package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    public void toConsonantTest() {
        assertEquals('b', new ToConsonant().toConsonant('a'));
        assertEquals('f', new ToConsonant().toConsonant('e'));
        assertEquals('j', new ToConsonant().toConsonant('i'));
    }
}
