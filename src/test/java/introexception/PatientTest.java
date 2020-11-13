package introexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {
    @Test
    void patientTest() {
        //Given
        Patient patient1 = new Patient("John Doe","567894", 1923);

        //Patient patient2 = new Patient("John Doe","567894", 1899); // expected Could not resolve 1899
        //Patient patient3 = new Patient(" ","567894", 1923); // Wrong name: - empty string

        // When
        assertEquals("John Doe", patient1.getName());

    }
}
