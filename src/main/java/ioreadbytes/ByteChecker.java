package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        Path file = Path.of(fileName);
        int sum = 0;
        try(InputStream is = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = new byte[1000];
            int size;
            while((size = is.read(bytes)) > 0) {
                for(int i = 0; i < size; i++) {
                    if(bytes[i] == (byte) 'a') {
                        sum++;
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
        return sum;
    }
}
