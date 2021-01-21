package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteReader {
    public static void main(String[] args) {
        Path file = Path.of("secret.dat");
        try (InputStream inputStream = Files.newInputStream(file)){
            byte[] content = inputStream.readAllBytes();
            for(int i = 0; i < content.length; i++) {
                int plusTen = content[i] + 10;
                char c = (char) plusTen;
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }
}
