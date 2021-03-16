package finalexamprepare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void increasePrice() {
        Software software = new DeveloperSoftware("Java",10000);
        software.increasePrice();
        assertEquals(11000.0,software.getPrice());
    }
}