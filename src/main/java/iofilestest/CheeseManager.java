package iofilestest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CheeseManager {

    public void saveToFile(Path target, List<Cheese> cheeseList) {
        try (PrintStream bos =new PrintStream(Files.newOutputStream(target))){
            for(Cheese c : cheeseList) {
                bos.println(c.getName() + ":" + c.getLactose());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file!", e);
        }
    }
    public Cheese findCheese(Path search,String name) {
        List<Cheese> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(search)))){
            String line;
            while((line=br.readLine()) != null) {
                String[] parts = line.split(":");
                result.add(new Cheese(parts[0],Double.parseDouble(parts[1])));
            }
            for(Cheese c : result) {
                if(c.getName().equals(name)) {
                    return c;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        throw new IllegalArgumentException("Cheese not found");
    }

    public static void main(String[] args) {

    }

}
