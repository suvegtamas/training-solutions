package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> words, Path file) {
        try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(file))){
            for(String s : words) {
                if(!s.startsWith("_")) {
                    os.write(s.getBytes());
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file", e);
        }
    }
}
