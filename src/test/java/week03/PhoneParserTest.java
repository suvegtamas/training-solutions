package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParserTest {

    @Test
    public void phoneParserTest() {
        //Given
        PhoneParser parser = new PhoneParser();
        //When
        Phone phone = parser.parsePhone("12-1234567");
        //Then
        assertEquals("12", phone.getPrefix());
        assertEquals("1234567", phone.getNumber());
        assertEquals("12-1234567", phone.toString());
    }
}
