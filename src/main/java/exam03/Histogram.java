package exam03;

import templates.ReadFileTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while((line=reader.readLine()) != null) {
            for(int i = 0; i < Integer.parseInt(line); i++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/histogram.txt"))) {
            Histogram histogram = new Histogram();
            System.out.println(histogram.createHistogram(reader));
        } catch(IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
}
