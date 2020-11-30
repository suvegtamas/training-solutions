package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {
    public String getElements(List<String> elements) {
        if (elements.size() == 0) {
            return " ";
        }
        if (elements == null) {
            throw new NullPointerException("Elements must be filled.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; elements.size() > i; i +=2) {
            sb.append(elements.get(i));

        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ListSelector ls = new ListSelector();

        System.out.println(ls.getElements(Arrays.asList("a","b","c","d","e","f")));
    }
}
