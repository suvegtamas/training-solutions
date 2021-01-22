package ioprintwriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {
    private List<String> names;


    public SalaryWriter(List<String> names) {
        this.names = names;
    }
    public void writeNamesAndSalaries(Path file) {
        try (BufferedWriter bw = Files.newBufferedWriter(file)){
            for(String s : names) {
                bw.write(s + ": " + calcSalary(s) +"\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
    public int calcSalary(String name) {
        int result = 0;
        if(name.startsWith("Dr.")) {
             result = 500000;
         } else if(name.startsWith("Mr.") || name.startsWith(("Mrs."))) {
             result = 200000;
         } else {
             result = 100000;
         }

        return result;
    }
}
