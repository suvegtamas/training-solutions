package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueLettersTest {

    @Test
    void uniqueLetterCounter() {
        UniqueLetters ul = new UniqueLetters();
        int result = ul.uniqueLetterCounter("bebcdu");
        assertEquals(5,result);
    }
}