package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {
    public String merge(Path file, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            line = Files.readString(file);
            for(Employee e : employees) {
                String result = line.replace("{nev}",e.getName()).replace("{ev}", Integer.toString(e.getYearOfBirth()));
                sb.append(result).append("\n");
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TemplateMerger tm = new TemplateMerger();
        String result = tm.merge(Path.of("src/main/resources/employeedata.txt"),List.of(new Employee("John Doe",1980),new Employee("Jack Doe", 1990)));
        System.out.println(result);
    }
}
