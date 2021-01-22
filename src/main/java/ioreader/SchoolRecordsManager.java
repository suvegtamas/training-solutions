package ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {
    private List<Student> students = new ArrayList<>();
    public void readGradesFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);
        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line=br.readLine()) != null) {
                String[] split = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for(int i = 1; i < split.length; i++) {
                    grades.add(Integer.parseInt(split[i]));
                }
                Student student = new Student(split[0],grades);
                students.add(student);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }

    }
    public double classAverage() {
        double sum = 0;
        for(Student s : students) {
            sum += s.average();
        }
        return sum / students.size();
    }

    public List<Student> getStudents() {
        return students;
    }
}
