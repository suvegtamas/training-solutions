package week11d03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {
    @DisplayName("Words with given character")
    @Test
    void wordsWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> result = wordFilter.wordsWithChar(List.of("falat","asztal","nem","hid","habri"), 'a');
        assertEquals(List.of("falat","asztal","habri"),result);
    }
    @DisplayName("Error handling, list can't be empty")
    @Test
    void noListGivenMustThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new WordFilter().wordsWithChar(List.of(),'a'));
        assertEquals("List must be given.", ex.getMessage());
    }

}