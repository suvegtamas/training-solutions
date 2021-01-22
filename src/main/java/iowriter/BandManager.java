package iowriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {
    private List<Band> bands = new ArrayList<>();
    public void readBandsFromFile(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line = br.readLine()) != null) {
                String[] separate = line.split(";");
                bands.add(new Band(separate[0],Integer.parseInt(separate[1])));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
    public void writeBandsBefore(Path file,int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(file)){
            for(Band b : olderThan(year)) {
                bw.write(b.getName() + " " + b.getYear() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file!",e);
        }
    }
    private List<Band> olderThan(int year) {
        List<Band> result = new ArrayList<>();

        for (Band band : bands) {
            if (band.getYear() < year) {
                result.add(band);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        BandManager bandManager = new BandManager();
        bandManager.readBandsFromFile(Path.of("src/main/resources/bands_and_years.txt"));
        bandManager.writeBandsBefore(Path.of("src/main/resources/tester.txt"),1990);
    }
}
