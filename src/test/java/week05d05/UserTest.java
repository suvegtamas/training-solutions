package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    @Test
    void whenEmailIsInvalid() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("John", "Doe", "johndoe"));
        assertEquals("Invalid email.", ex.getMessage());
    }


    @Test
    void getFullNameTest1() {
        assertEquals("John Doe", new User("John", "Doe", "johndoe@gmail.com").getFullName1());
    }


    @Test
    void getFullNameTest2() {
        assertEquals("John Doe", new User("John", "Doe", "johndoe@gmail.com").getFullName2());
    }


    @Test
    void getFullNameTest3() {
        assertEquals("John Doe", new User("John", "Doe", "johndoe@gmail.com").getFullName3());
    }
}
