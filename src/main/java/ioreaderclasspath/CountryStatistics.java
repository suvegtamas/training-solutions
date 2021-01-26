package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countryList = new ArrayList<>();
    public void readFromFile(String fileName) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream(fileName)))) {
            String line;
            while((line=br.readLine()) != null) {
                String[] splitter = line.split(" ");
                countryList.add(new Country(splitter[0],Integer.parseInt(splitter[1])));
            }
        }
        catch(IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }

    }
    public Country mostBorderCountries() {
        Country withMoreNeighbors = countryList.get(0);
        for(Country c : countryList) {
            if(c.getBorderCountries() > withMoreNeighbors.getBorderCountries()) {
                withMoreNeighbors = c;
            }
        }
        return withMoreNeighbors;
    }
    public int numberOFCountries() {
        int counter = 0;
        for(Country c : countryList) {
            counter++;
        }
        return counter;
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }
    
}
