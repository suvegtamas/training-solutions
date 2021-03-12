package covid;



import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityList {
    private final List<City> cityList = new ArrayList<>();

    public void readFile(BufferedReader reader) {
        try(reader) {
            String line;
            while((line=reader.readLine()) != null) {
                String[] parts = line.split(";");
                cityList.add(new City(parts[0],parts[1]));
            }
        }catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public List<City> getCityList() {
        return new ArrayList<>(cityList);
    }


}
