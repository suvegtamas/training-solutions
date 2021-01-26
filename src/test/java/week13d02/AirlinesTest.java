package week13d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesTest {
    @BeforeEach
    void setUP() {
        Airlines airlines = new Airlines();
        airlines.readFile(Path.of("src/main/resources/cities.txt"));
    }


//        System.out.println(airlines.statusCounter());
//        Airways airways = airlines.getFlightDetails("WH4925");
//        System.out.println(airways);
//        List<Airways> result = airlines.findByCityAndStatus("Toronto",Status.DEPARTURE);
//        System.out.println(result);
//        Airways a = airlines.getEarliest();
//        System.out.println(a);


    @Test
    void getFlightDetails() {

    }

    @Test
    void findByCityAndStatus() {
    }

    @Test
    void getEarliest() {
    }
}