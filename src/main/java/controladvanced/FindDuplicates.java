package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(List<Integer> items) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < items.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (items.get(i).equals(items.get(j))) {
                        result.add(items.get(i));
                        break;
                    }
                }
            }
            return result;
        }

    }

