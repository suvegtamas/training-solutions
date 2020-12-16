package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> united = new ArrayList<>();
        for (String s : first) {
            united.add(s);
        }
        for (String p : second) {
            if(!united.contains(p)) {
                united.add(p);
            }

        }

        Collections.sort(united);
        return united;
    }


}
