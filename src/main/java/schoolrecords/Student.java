package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;

    public double calculateAverage() {
        if (marks.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for ( Mark mark : marks) {
            sum = sum + mark.getMarkType().getValue();
        }
        return Math.round(sum / marks.size() * 100.0) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        if ( marks.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        int i = 0;
        for (Mark mark : marks) {
            if ((mark.getSubject().getSubjectName().equals(subject.getSubjectName()))) {
                sum = sum + mark.getMarkType().getValue();
                i++;
            }
        }
        return Math.round(sum / i * 100.0) / 100.0;
    }
    public String getName() {
        return name;
    }
    public void grading(Mark mark) {
        if(mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }
    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }
    @Override
    public String toString() {
        //Kovács marks: matematika: excellent(5)
       StringBuilder str = new StringBuilder();
       str.append(name);
       str.append(" marks: ");
       for ( Mark mark : marks) {
           str.append(mark.getSubject().getSubjectName() + ": " + mark.getMarkType().getDescription() + "(" + mark.getMarkType().getValue() + ")");
       }
        return str.toString();
    }
}
