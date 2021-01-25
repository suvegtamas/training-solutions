package wek13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongestCityName {
    private List<City> cityList = new ArrayList<>();
    private List<String> cityNames = new ArrayList<>();

    public void readFile(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line=br.readLine()) != null) {
                String[] splitter = line.split(";");
                cityList.add(new City(splitter[0],splitter[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
    public void sortListByName() {
        for(City c : cityList) {
            cityNames.add(c.getName());
        }
    }
   private int letterCounter(String input) {
        int counter = 0;
        for(char c : input.toCharArray()) {
            counter++;
        }
        return counter;
    }
    private String longestName() {
        String longest = cityNames.get(0);
        for(String s : cityNames) {
            if(letterCounter(s) > letterCounter(longest)) {
                longest = s;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        LongestCityName lcn = new LongestCityName();
        lcn.readFile(Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv"));
        lcn.sortListByName();
        System.out.println(lcn.longestName());
    }

}
