package week14d03;

import java.util.*;

public class ClassNoteBook {
    private final List<Student> students = new ArrayList<>();

    public List<Student> sortNoteBook() {
        List<Student> result = new ArrayList<>(students);
       Collections.sort(result);
       return result;
    }

    public void add(Student s) {
        students.add(s);
    }

    @Override
    public String toString() {
        return "ClassNoteBook{" +
                "students=" + students +
                '}';
    }
}
