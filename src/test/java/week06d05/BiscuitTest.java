package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiscuitTest {
    @Test
    void testMethodOfBiscuit() {
        assertEquals("type=OREO gramAmount=300" , Biscuit.of(BiscuitType.OREO, 300).toString());
        assertEquals("type=FANTASY gramAmount=200" , Biscuit.of(BiscuitType.FANTASY, 200).toString());
        assertEquals("type=BLISS gramAmount=400" , Biscuit.of(BiscuitType.BLISS, 400).toString());
    }

}
