package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {
    @Test
    void wordEraserTest() {
        WordEraser we = new WordEraser();
        assertEquals("banan", we.eraseWord("alma banan alma", "alma"));
    }
}
