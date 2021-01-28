package iofilestest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheeseManagerTest {

    @TempDir
    public Path tempFolder;

    CheeseManager cm = new CheeseManager();

    @Test
    void createCheeseManagerTest() throws IOException {
        Path file = Files.createFile(tempFolder.resolve("test.txt"));
        cm.saveToFile(Path.of("src/main/resources/cheese.dat"),List.of(new Cheese("Ricotta cheese", 2.4),new Cheese("Camembert",0.04)));
        Cheese result = cm.findCheese(Path.of("src/main/resources/cheese.dat"),"Camembert");

        assertEquals(0.04,result.getLactose());
        assertEquals("Camembert",result.getName());
    }


}