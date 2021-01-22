package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CovidCounter {
    public int countCovid(String fileName) {
        int count = 0;
        Path file = Path.of("src/main/resources/" + fileName);
        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line=br.readLine()) != null) {
                String[] lineContent = line.split(" ");
                for(String s : lineContent) {
                    if(s.equals("koronavírus")) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return count;
    }

    public static void main(String[] args) {
        int counted = new CovidCounter().countCovid("Index.html");
        System.out.println(counted);
    }
}
