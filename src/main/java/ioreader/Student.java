package ioreader;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> gradeList = new ArrayList<>();

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public double average() {
        double sum = 0;
        for(Integer item : gradeList) {
            sum+= item;
        }
        return sum / gradeList.size();
    }
    public boolean isIncreasing() {
        for(int i = 1; i < gradeList.size(); i++) {
            if (gradeList.get(i-1) > gradeList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }
}
/* A követező feladat egy osztálynapló nyilvántartása. A grades.txt fájl minden sora tartalmaz egy nevet és utána a tanuló
jegyeit. Készíts egy Student osztályt mely a tanuló nevét és jegyeinek listáját képes tárolni! Legyen benne egy átlagszámító
metódus, valamint egy metódus, ami képes eldönteni, hogy a tanuló jegyei emelkednek-e.

Készíts egy SchoolRecordsManager osztályt, ami beolvassa fájlból az adatokat, eltárolja, és ezen felül még képes egy
osztályátlag számítására is!*/
