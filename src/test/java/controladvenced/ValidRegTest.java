package controladvenced;

import controladvanced.ValidReg;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidRegTest {

    @Test
    public void validRegTest() {
        List<String> validRegList = Arrays.asList("ABC-123;2007;Volvo;Red", "CBA-234;1967;Ford;blue", "THOM18;2016;Toyota;white");
        List<String> result = new ValidReg().filterLines(validRegList);
        assertEquals(Arrays.asList("ABC-123;2007;Volvo;Red"), result);
    }
}
