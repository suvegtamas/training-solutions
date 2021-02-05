package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class WordLineCounter {

    public Map<String,Integer> countWords(BufferedReader reader, String... words) {
        Map<String,Integer> result = new HashMap<>();
        for(String s:words) {
            result.put(s,0);
        }
        try (reader){
            String line;
            while((line=reader.readLine())!=null) {
                for(String keys : result.keySet()) {
                    if(line.toLowerCase().contains(keys)) {
                        int before = result.get(keys);
                        int after = before + 1;
                        result.put(keys,after);
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        WordLineCounter wld = new WordLineCounter();
        Map<String,Integer> result = wld.countWords(Files.newBufferedReader(Path.of("src/main/resources/hackiko.srt")),"hachiko", "haza",
                "pályaudvar", "jó");
        System.out.println(result);
    }
}
