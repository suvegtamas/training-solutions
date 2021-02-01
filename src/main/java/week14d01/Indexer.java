package week14d01;

import java.util.*;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {
        Map<Character,List<String>> result = new TreeMap<>();

        for(String s : names) {
            char c = s.charAt(0);
            if(result.containsKey(c)) {
                List<String> temp = new ArrayList<>();
                temp.addAll(result.get(c));
                result.put(c, temp);
            } else {
                List<String> temp2= new ArrayList<>(Arrays.asList(s));
                result.put(c,temp2);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
    }
}
/* System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}*/
