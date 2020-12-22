package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String str) {
        return str == null || str.isBlank();
    }
    public static boolean isEmpty(List<String> str) {
        if (str == null) {
            return true;
        }
        if(str.size() == 0) {
            return true;
        }
        return false;
    }
}
