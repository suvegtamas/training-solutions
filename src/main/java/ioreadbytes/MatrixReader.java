package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {
    private List<byte[]> bytesList = new ArrayList<>();
    public void readBytesAndCreateMatrix(String fileName) {
        Path file = Path.of(fileName);
        try (InputStream is = new BufferedInputStream(Files.newInputStream(file))){
            byte[] bytes = new byte[1000];
            int size = 0;
            while((size = is.read(bytes)) > 0) {
                bytesList.add(bytes);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
    public int numberOfColumnsWhereMoreZeros() {
        int columnsWithMoreZeros = 0;
        for(int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;
            for(int j = 0; j < bytesList.size(); j++) {
                if (bytesList.get(j)[i] == (byte) '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if(zeros > ones) {
                columnsWithMoreZeros++;
            }
        }
        return columnsWithMoreZeros;
    }
    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(bytesList);
    }

    public static void main(String[] args) {
        MatrixReader mr = new MatrixReader();
        mr.readBytesAndCreateMatrix("src/main/resources/matrix.dat");
    }


}
/* Ebben a feladatban egy mátrix adatszerkezettel kell dolgoznod. Hozz létre egy listát, ami byte tömbök tárolására alkalmas!
Tárold el ebben a listában a mátrix.dat állományból beolvasott, minden 1000 bájtot tartalmazó byte tömböt!

Az állományban csak egyesek és nullák vannak. Írj egy metódust, ami visszaadja azon oszlopok számát, ahol több nulla,
mint egyes van a mátrixban!*/