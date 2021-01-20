package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        for ( Student st : students) {
            if (st.getName().equals(student.getName())) {
                return false;
            }
        }
        return students.add(student);
    }
    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        for (Student st : students) {
            sum = sum + st.calculateAverage();
        }

        if (sum == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        return Math.round(sum / students.size() * 100.0) / 100.0;


    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0.0;
        int i = 0;
        for (Student st : students) {
            if (st.calculateSubjectAverage(subject) != 0.0) {
                sum = sum + st.calculateSubjectAverage(subject);
                i++;
            }
        }
        return Math.round((sum / i) * 100.0) / 100.0;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student st : students) {
            if (st.getName().equals(name)) {
                return st;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found!" + " " + name);
    }
    public String getClassName() {
        return className;
    }
    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
    public String listStudentNames() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            str.append(students.get(i).getName());
              if(students.size() > i + 1) {
                  str.append(", ");
              }
        }
        return str.toString();
    }
    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> results = new ArrayList<>();
        for (Student st : students) {
            StudyResultByName result = new StudyResultByName(st.calculateAverage(), st.getName());
            results.add(result);
        }
        return results;
    }
    public boolean removeStudent(Student student) {

        for ( Student st : students) {
            if (st.getName().equals(student.getName())) {
                return students.remove(st);
            }
        }
        return false;
    }
    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }
}
