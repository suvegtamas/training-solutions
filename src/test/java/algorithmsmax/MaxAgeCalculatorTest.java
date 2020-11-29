package algorithmsmax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAgeCalculatorTest {
    @Test
    void maxAgeFromTrainersTest() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        List<Trainer> trainerList = Arrays.asList(new Trainer("John",23),
                                                  new Trainer("Jack",43),
                                                  new Trainer("Jane",18));

        assertEquals("Jack 43",maxAgeCalculator.trainerWithMaxAge(trainerList).toString());
    }
}
