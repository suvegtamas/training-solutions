package iowritestring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class Diary {
    public void newMark(Path file, int mark) {
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }

    }


    public void average(Path file) {
        try {
            List<String> myFile = Files.readAllLines(file);
            double sum = 0;
            for (String s : myFile) {
                sum += Double.parseDouble(s);
            }

            Files.writeString(file, "average: " + (sum / myFile.size()), StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }

    }


}
/* Ebben a feladatban egy iskolai naplózó rendszert kell megvalósítanod.

Készíts a school csomagban egy Diary nevű osztályt benne egy newMark() metódussal, ami paraméterül várja a
tanuló nevét és egy jegyet! Ha létezik a "tanulo_neve.txt" akkor a jegyet hozzáfűzi az állomány végére.
Ha nem, akkor egy új állományt hoz létre "tanulo_neve.txt" formátumban, és beleírja a jegyet.
Azt, hogy létezik-e egy fájl a Files.exists(path) metódussal tudod eldönteni.
A fájlok a src/main/resources/ könyvtárban legyenek!

Az év végén a tanár szeretné a tanuló fájl utolsó sorába az átlagot beírni. Írj egy metódust average() névvel,
ami a fájl utolsó sorába a jegyek átlagát írja be! Például "average: 5".*/
