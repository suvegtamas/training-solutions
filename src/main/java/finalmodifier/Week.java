package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> week = Arrays.asList("Hetfo", "Kedd", "Szerda", "Csutrtok", "Pentek", "Szombat", "Vasarnap");
    public static void main(String[] args) {
        week.set(1, "Szerda");
        System.out.println(week);
    }





}
