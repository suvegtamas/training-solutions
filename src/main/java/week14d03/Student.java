package week14d03;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    private Map<String, List<Integer>> studentMarks = new TreeMap<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void addMarkToListBySubject(String subject,int mark) {

        if(!studentMarks.containsKey(subject)) {
            studentMarks.put(subject,new ArrayList<>());
        }
        studentMarks.get(subject).add(mark);
    }

    public Map<String, List<Integer>> getStudentMarks() {
        return studentMarks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentMarks=" + studentMarks +
                ", name='" + name + '\'' +
                '}';
    }
}
