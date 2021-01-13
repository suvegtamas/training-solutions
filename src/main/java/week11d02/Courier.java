package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {


    public List<Ride> getRides() {
        return rides;
    }

    private List<Ride> rides = new ArrayList<>();

    public int checkDays() {
        for (int i = 0; i < rides.size() - 1; i++) {
            if (rides.get(i + 1).getDay() - rides.get(i).getDay() > 1) {
                return rides.get(i).getDay() + 1;
            }
        }
        return -1;
    }

    public void addRide(Ride ride) {
        if (isSmallerThan(ride)) {
            rides.add(ride);
        } else throw new IllegalArgumentException("wrong Ride...");
    }

    public boolean isSmallerThan(Ride ride) {
        for (Ride r : rides) {
            if (r.getDay() > ride.getDay()) {
                return false;
            }
            if (r.getDay() == ride.getDay()) {
                if (r.getRideId() > ride.getRideId()) {
                    return false;
                }
            }
        }
        return true;
    }
    
}


/*
1 1 20 - Ride osztály
-hét napja,
-napon belül sorszám
-megtett km
addRide - csak sorrendben adható hozzá ride
1 1 20
2 1
nap szerint is és napo belüli sorszám szerint is rendezett kell legyen a lista
ha a ride nem
A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statissztikákat.
A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar.
Ezután azt, hogy az adott nap hányadik fuvarját teljesítette és ezután azt, hogy
hány kilométer volt az adott fuvar. A futár egy-egy fuvarját reprezentálja a `Ride`
 nevű osztály, adatagokkal, konstruktorra, getterekkel.  Készítsd el a `Courier` osztályt.
  Ez fogja a futárt reprezentálni. Legyen egy rides listája ami fuvarokat tárol.
   Legyen egy addRide metódus, ami csak sorrendben enged hozzáadni elemeket a listához.
    Figyeljünk viszont arra, hogy nem feltétlenül minden nap dolgozott a futár, de ha már bekerült egy 3. napi fuvar, akkor ne kerülhessen be egy 2. napi. És arra is figyelj, hogy a napon belül is sorrendben kerüljenek be az adatok. Ha a paraméterül kapott Ride nem felel meg a feltételeknek dobjunk `IllegalArgumentException`-t.   Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott. Ha több ilyen nap is van akkor a korábbit!
 */