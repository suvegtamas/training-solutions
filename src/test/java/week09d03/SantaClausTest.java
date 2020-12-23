package week09d03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantaClausTest {
    List<Person> result = new ArrayList<>();
   @BeforeEach
   void setUp() {
       result.add(new Person("John",25));
       result.add(new Person("Abby",12));
       result.add(new Person("Ralf",45));
   }
   @AfterEach
   void tearDown() {
       this.result = null;
   }


    @Test
     void testChristmas() {
        SantaClaus sc = new SantaClaus(result);
        sc.getThroughChimneys();
        assertEquals(result.get(1).getPresent(),Present.Toy);
    }
}
