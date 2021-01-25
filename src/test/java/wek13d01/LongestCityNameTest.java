package wek13d01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongestCityNameTest {

    private LongestCityName longestCityName = new LongestCityName();

    @Test
    public void readFileTestAndOutputLongest() {
        Path file = Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv");
    assertEquals("Jászfelsőszentgyörgy",longestCityName.outputLongestCityName(file));

    }

}