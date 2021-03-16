package finalexamprepare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void increasePrice() {
        Software software = new OfficeSoftware("Java",10000);
        software.increasePrice();
        assertEquals(10500.0,software.getPrice());
    }
}