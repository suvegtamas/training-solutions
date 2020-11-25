package week05d02;

import java.util.Arrays;
import java.util.List;

public class ChangeLetter {
    private List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public String changeVowels(String text) {
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            if (vowels.contains(text.substring(i,i+1))) {
                sb.append("*");
            } else {
                sb.append(text.substring(i,i+1));
            }
        }
        return sb.toString();
    }


}

