package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class NameWriter {

    private Path file;
    public NameWriter(Path file) {
        this.file = file;
    }
    public void addAndWrite(String name) {
        try (BufferedWriter bw = Files.newBufferedWriter(file,StandardOpenOption.APPEND)){
            bw.write(name +"\n");

        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!",  e);
        }
    }

}

/* Az első feladatban egyszerűen neveket fogunk eltárolni fájlban és listában egyaránt.
A NameWriter osztály konstruktorban megkapja az írni kívánt fájlt.
Az addAndWrite() metódus egy nevet vár paraméterül, amelyet hozzáfűzi a fájlhoz.
 A hozzáfűzéshez használd a korábban megismert StandardOpenOption.Append paramétert a newBufferedWriter() metódusban.*/
