package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    public void withoutAccentsTest() {
        assertEquals('a', new WithoutAccents().withoutAccents('á'));
        assertEquals('e', new WithoutAccents().withoutAccents('é'));
        assertEquals('u', new WithoutAccents().withoutAccents('ű'));
        assertEquals('U', new WithoutAccents().withoutAccents('Ű'));
    }


}
