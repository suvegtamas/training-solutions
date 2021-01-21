package ioreadstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private List<Human> humans = new ArrayList<>();
    private Path myFile;

    public FileManager(String myFile) {
        this.myFile = Path.of(myFile);
    }

    public void readFromFile() {
        try {
            List<String> line = Files.readAllLines(myFile);
            for(String s : line) {
                String[] result = s.split(" ");
                humans.add(new Human(result[0],result[1]));
            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can not read file");
        }
    }

    public List<Human> getHumans() {
        return humans;
    }

    public Path getMyFile() {
        return myFile;
    }
}
