package week14d03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {
    ClassNoteBook classNoteBook = new ClassNoteBook();
    Student s1 = new Student("John Doe");
    Student s2 = new Student("Jane Doe");

    @BeforeEach
    void setUp() {
        classNoteBook.add(s1);
        classNoteBook.add(s2);
        s1.addMarkToListBySubject("matek", 5);
        s1.addMarkToListBySubject("matek", 7);
    }
    @AfterEach
    void tearDown() {
        classNoteBook = null;
    }

    @Test
    void createStudentTest() {
        assertEquals("Jane Doe", s2.getName());
        assertEquals("John Doe", s1.getName());
    }

    @Test
    void testAddMarkToList() {
        assertEquals(5, s1.getStudentMarks().get("matek").get(0));
        System.out.println(classNoteBook.sortNoteBook());
    }

    @Test
    void testSortStudents() {
        assertEquals("[Student{name='Jane Doe'}, Student{name='John Doe'}]",classNoteBook.sortNoteBook().toString());
    }
}