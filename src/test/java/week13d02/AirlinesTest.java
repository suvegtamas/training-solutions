package week13d02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.DateFormatter;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesTest {
    Airlines airlines = new Airlines();

    @BeforeEach
    void setUp() {
        airlines.readFile(Path.of("src/main/resources/cities.txt"));
        List<Airways> result = airlines.getAirlines();
    }


    @Test
    void getFlightDetails() {
     Airways result = airlines.getFlightDetails("WH4925");
       assertEquals("WH4925 ARRIVAL Vaduz 11:53",result.toString());
    }

    @Test
    void findByCityAndStatus() {
        List<Airways> flight = airlines.findByCityAndStatus("Toronto",Status.DEPARTURE);
        assertEquals(LocalTime.of(11,30),flight.get(0).getTime());
        assertEquals(LocalTime.of(11,41),flight.get(1).getTime());
        assertEquals(LocalTime.of(20,50),flight.get(2).getTime());
    }

    @Test
    void getEarliest() {
        Airways a = airlines.getEarliest();
        assertEquals("BJ2309",a.getId());
    }
}