package week13d05;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueLetters {
    public int uniqueLetterCounter(String word) {
      Set<Character> result = new HashSet<>();
        for(Character c : word.toLowerCase().toCharArray()) {
            if(checkLetter(c)) {
                result.add(c);
            }
        }
        return result.size();
    }
    public boolean checkLetter(char c) {
        if(c > 'a' && c < 'z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        UniqueLetters ul = new UniqueLetters();
        int result = ul.uniqueLetterCounter("aabbc");
        System.out.println(result);
    }

}
