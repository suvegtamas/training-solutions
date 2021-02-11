package week15d04;

import java.util.Comparator;

public class ByCasesComparator implements Comparator<Cases> {
    @Override
    public int compare(Cases o1, Cases o2) {
        return o2.getCases() - o1.getCases();
    }
}
