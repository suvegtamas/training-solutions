package exam03gyakorlat;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private final Map<String, Integer> owls = new HashMap<>();
    public void readFromFile(BufferedReader reader)  {
       try(reader) {
           String line;
           while((line=reader.readLine()) != null) {
               processLine(line);
           }
       }
       catch(IOException ioe) {
           throw new IllegalStateException("Can't read file!", ioe);
       }
    }

    public int getNumberOfOwls(String city) {
        for(String s : owls.keySet()) {
            if(s.equals(city)) {
                return owls.get(s);
            }
        }
        throw new IllegalArgumentException("No owls in this city");
    }

    private void processLine(String line) {
        String[] parts = line.split("=");
        owls.put(parts[0],Integer.parseInt(parts[1]));
    }

    public Map<String, Integer> getOwls() {
        return owls;
    }

}
