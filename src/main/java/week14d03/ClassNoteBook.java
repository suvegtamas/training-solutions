package week14d03;

import java.util.*;

public class ClassNoteBook {
    private List<Student> students = new ArrayList<>();

    private void sortNoteBook() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        });
    }
    private void add(Student s) {
        students.add(s);
    }

    @Override
    public String toString() {
        return "ClassNoteBook{" +
                "students=" + students +
                '}';
    }

    public static void main(String[] args) {
        ClassNoteBook classNoteBook = new ClassNoteBook();
        Student s1 = new Student("John Doe");
        Student s2 = new Student("Jane Doe");
        classNoteBook.add(s1);
        classNoteBook.add(s2);
        s1.addMarkToListBySubject("matek",5);
        s1.addMarkToListBySubject("matek",7);
        classNoteBook.sortNoteBook();
        System.out.println(classNoteBook);



    }
}
