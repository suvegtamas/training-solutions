package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    int cursor = -1;

    public SimpleBag() {
        super();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0 || items == null;
    }
    public int size() {
        int count = 0;
        for (Object item : items) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }
    public void beforeFirst() {
        cursor = -1;
    }
    public boolean hasNext() {
        return !(isEmpty() || cursor >= items.size() - 1);
    }
    public Object next() {
        cursor++;
        return items.get(cursor);
    }
    public boolean contains(Object item) {
       return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
