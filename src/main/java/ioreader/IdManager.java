package ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private final List<String> ids = new ArrayList<>();
    public void readIdsFromFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))){
            String line;
            while((line = br.readLine()) != null) {
                ids.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }

}
/* Ez az osztály felelős az idnumbers.txt (kitalált) személyi igazolvány számokat tartalmazó szöveges állomány feldolgozásáért.
 A readIdsFromFile() metódus megkap egy fájlnevet, és annak sorait tárolja el az List<String> ids listában.*/
