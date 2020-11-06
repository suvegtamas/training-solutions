package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> programCodes = new ArrayList<>();
        programCodes.add("Java");
        programCodes.add("Python");
        programCodes.add("JavaScript");
        for ( String item : programCodes) {
            if (item.length() > 5) {
                System.out.println(item);
            }
        }
    }
}
