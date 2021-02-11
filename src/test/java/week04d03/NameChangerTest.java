package week04d03;

import org.junit.jupiter.api.Test;
import week04d01.NameChanger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameChangerTest {

    @Test
    void NameChangerTest() {

        assertEquals("John Doe", new NameChanger("John Doe").getFullName());
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new NameChanger(" "));
        assertEquals("Invalid name:", ex.getMessage());
    }
    @Test
    void changeNameTest() {
        NameChanger name = new NameChanger("John Doe");
        assertEquals("John Vans", name.changeFirstName("Vans"));

    }
}
