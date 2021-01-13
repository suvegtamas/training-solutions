package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {
    public List<String> wordsWithChar(List<String> words, char c) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("List must be given.");
        }
        List<String> result = new ArrayList<>();
        for (String s : words) {
           if (isInWord(s,c)) {
               result.add(s);
           }

        }
        return result;
    }


    private boolean isInWord(String word, char c) {
       for (int i = 0; i < word.length();i++) {
           if(word.charAt(i) == c) {
               return true;
           }
       }
        return false;
    }


}
/** Készíts egy WordFilter osztályt, melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
 * A metódus kiválógatja a paraméterül kapott String listából azokat a szavakat, melyekben előfordul a c karakter,
 * majd ezeket visszaadja egy listában.*/