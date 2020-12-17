package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    void testCreateBadMood() {
        assertEquals(3,new Trainer(new BadMood()).giveMark());
    }
    @Test
    void testCreateGoodMood() {
        assertEquals(5,new Trainer(new GoodMood()).giveMark());
    }
}
