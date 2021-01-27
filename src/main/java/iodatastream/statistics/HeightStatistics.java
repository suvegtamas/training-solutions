package iodatastream.statistics;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path path) {
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            outputStream.writeInt(heights.size());
            for (Integer height : heights) {
                outputStream.writeInt(height);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public static void main(String[] args) {
        new HeightStatistics().saveHeights(List.of(198, 201, 211, 195, 214, 208, 203, 198),Path.of("statistics.dat"));
    }
}
