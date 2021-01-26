package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airlines {
    private List<Airways> airlines = new ArrayList<>();

    public void readFile(Path file) {
        try ( BufferedReader br = Files.newBufferedReader(file)){
            airlines.clear();
           String line;
           while((line=br.readLine()) !=null) {
               String[] splitter = line.split(" ");
               String id = splitter[0];
               Status status = (splitter[1].equals("Arrival") ? Status.ARRIVAL : Status.DEPARTURE);
               String city = splitter[2];
               String[] timeSplitter = splitter[3].split(":");
               LocalTime time = LocalTime.of(Integer.parseInt(timeSplitter[0]),Integer.parseInt(timeSplitter[1]));
               airlines.add(new Airways(id,status,city,time));

           }
           // System.out.println(airlines);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
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
        //System.out.println(counterArr);
       // System.out.println(counterDep);
        return counterArr > counterDep ? Status.ARRIVAL : Status.DEPARTURE;
    }
    public Airways getFlightDetails(String flightId) {
        for(Airways s : airlines) {
            if(s.getId().equals(flightId)) {
                return s;
            }
        }
        throw new IllegalStateException("Can't find flight!");
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
        Airways earliest = airlines.get(0);
        for(Airways a : airlines) {
            if(a.getTime().isBefore(earliest.getTime()) && a.getStatus().equals(Status.DEPARTURE)) {
                earliest = a;
            }
        }
        return earliest;
    }

    public List<Airways> getAirlines() {
        return airlines;
    }
}
/* Adott egy fájl melyben egy reptér egy napi munkáját rögzítettük. Adott egy járatszám, az,
hogy érkező vagy felszálló gépről van-e szó. A kiinduló/cél város, attól függöen hogy indul vagy érkezik-e a
gép és a felszállás/leszállás pontos ideje.

A fájl:
FC5354 Arrival Dublin 18:16
KH2442 Departure Berlin 15:54
ID4963 Departure Amsterdam 15:22
CX8486 Arrival Brussels 10:37
EJ9251 Departure  Toronto 11:30
KJ7245 Departure Bern 6:18
JN6048 Arrival Moscow 18:39
MN5047 Arrival Athens 9:35

Az időpontok szándékosan így szereplnek, nincsenek nullák a számok előtt. Az adatok össze vissza szerepelnek
a fájlban.
Feladatok:
1. Olvasd be a fájl tartalmát a memóriába.
2. Határozd meg, hogy induló vagy érkező járatból volt-e több.
3. Legyen egy metódus ami járatszám alapján ad vissza egy jaratot.
4. Írj egy metódust ami bekér egy várost és azt, hogy az induló vagy érkező járatokat szeretnénk-e.
És egy Listába adjuk viassza az összes abba városba induló/érkező repülőt.
5. Adjuk vissza a legkorábban induló repülőt!
*/
