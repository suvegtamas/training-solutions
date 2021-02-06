package collectionsset;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {
    public Set<String> filterWords(String[] words) {
        Set<String> result =  new TreeSet<>();
        for(String s : words) {
            result.add(s);
        }
        return result;
    }
}
