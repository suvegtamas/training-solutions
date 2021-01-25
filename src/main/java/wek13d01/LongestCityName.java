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

    public String outputLongestCityName(Path file) {
        String result = "";
        try (BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line=br.readLine()) != null) {
                String[] splitter = line.split(";");
                cityList.add(new City(splitter[0],splitter[1]));
            }
            sortListByName(cityList);
            result = longestName(cityNames);

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return result;
    }
    private void sortListByName(List<City> cities) {
        for(City c : cities) {
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
    private String longestName(List<String> names) {
        String longest = names.get(0);
        for(String s : names) {
            if(letterCounter(s) > letterCounter(longest)) {
                longest = s;
            }
        }
        return longest;
    }

}
