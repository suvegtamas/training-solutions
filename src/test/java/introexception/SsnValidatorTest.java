package introexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SsnValidatorTest {

    @Test
    void ssnValidatorTest() {
        assertFalse(new SsnValidator().isValidSsn("123"));
        assertFalse(new SsnValidator().isValidSsn("12345678a"));
        assertFalse(new SsnValidator().isValidSsn("1234567822222"));
        assertTrue(new SsnValidator().isValidSsn("123456788"));
    }
}
