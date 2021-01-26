package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {
    public void makeImageFile(byte[][] bytes, Path folder) {
        Path file = folder.resolve("image.png");
        try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(file))){
            for(byte[] b : bytes) {
                os.write(b);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}
