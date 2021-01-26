package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airlines {
    private final List<Airways> airlines = new ArrayList<>();

    public void readFile(Path file) {
        try ( BufferedReader br = Files.newBufferedReader(file)){
            airlines.clear();
           String line;
           while((line=br.readLine()) !=null) {
               Airways result = separator(line);
               airlines.add(result);
           }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
    private Airways separator(String line) {
        String[] splitter = line.split(" ");
        String id = splitter[0];
        Status status = (splitter[1].equals("Arrival") ? Status.ARRIVAL : Status.DEPARTURE);
        String city = splitter[2];
        String[] timeSplitter = splitter[3].split(":");
        LocalTime time = LocalTime.of(Integer.parseInt(timeSplitter[0]),Integer.parseInt(timeSplitter[1]));
        return new Airways(id,status,city,time);
    }

    public Status statusCounter() {
        int counterArr = 0;
        int counterDep = 0;
        for(Airways a : airlines) {
            if(a.getStatus().equals(Status.ARRIVAL)) {
                counterArr++;
            } else {
                counterDep++;
            }
        }
        return counterArr > counterDep ? Status.ARRIVAL : Status.DEPARTURE;
    }
    public Airways getFlightDetails(String flightId) {
        for(Airways s : airlines) {
            if(s.getId().equals(flightId)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Can't find flight!");
    }
    public List<Airways> findByCityAndStatus(String city, Status status) {
        List<Airways> result = new ArrayList<>();
        for(Airways a : airlines) {
            if(a.getCity().equals(city) && a.getStatus().equals(status)) {
                result.add(a);
            }
        }
        return result;
    }
    public Airways getEarliest() {
        LocalTime time = LocalTime.of(23,59);
        Airways result = null;
        for(Airways a : airlines) {
            if(a.getTime().isBefore(time) && a.getStatus().equals(Status.DEPARTURE)) {
                result = a;
            }
        }
        return result;
    }

    public List<Airways> getAirlines() {
        return airlines;
    }
}

