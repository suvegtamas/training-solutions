package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void changeLetterTest() {
        //Given
        ChangeLetter cl = new ChangeLetter();
        //When
        String word = cl.changeVowels("abrakadabra");
        //Then
        assertEquals("*br*k*d*br*", word);
    }
}
