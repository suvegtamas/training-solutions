package controladvenced;

import controladvanced.FindDuplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateTest {

    @Test
    public void findDuplicateTest() {
        assertEquals(Arrays.asList(), new FindDuplicates().findDuplicates(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(), new FindDuplicates().findDuplicates(Arrays.asList()));
        assertEquals(Arrays.asList(2), new FindDuplicates().findDuplicates(Arrays.asList(1, 2, 2 , 5)));
        assertEquals(Arrays.asList(2, 5), new FindDuplicates().findDuplicates(Arrays.asList(1, 2, 2 , 5, 5)));
    }
}
