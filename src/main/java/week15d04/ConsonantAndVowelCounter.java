package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ConsonantAndVowelCounter {
    private static final String CONSONANTS ="aáeéiíoóöőuúüű";
    private static final String VOWELS = "ptkbdggytyfvszzszshjcsdzscdzlrmnny";

    public Map<String,Integer> consonantAndVowelCounter(BufferedReader reader) {
        Map<String,Integer> result = new HashMap<>();
        try(reader) {
            String line;
            while((line=reader.readLine()) != null) {
                String lineNoSpace = line.replaceAll("\\s","");
                System.out.println(lineNoSpace);
                result.put("Consonants", countConsonants(lineNoSpace));
                result.put("Vowels", countVowels(lineNoSpace));
                result.put("Others", countOtherChars(lineNoSpace));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
        return result;
    }

    private int countConsonants(String str) {
        int counter = 0;
        for(char c : str.toCharArray()) {
            if(CONSONANTS.contains(Character.toString(c))) {
                counter++;
            }
        }
        return counter;
    }
    private int countVowels(String str) {
        int counter = 0;
        for(char c : str.toCharArray()) {
            if(VOWELS.contains(Character.toString(c))) {
                counter++;
            }
        }
        return counter;
    }
    private int countOtherChars(String str) {
        int counter = 0;
        for(char c : str.toCharArray()) {
            if(!CONSONANTS.contains(Character.toString(c)) && !VOWELS.contains(Character.toString(c))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ConsonantAndVowelCounter cavc = new ConsonantAndVowelCounter();
        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/consonantsandvowels.txt"))){
            Map<String,Integer> result = cavc.consonantAndVowelCounter(br);
            System.out.println(result);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
}
