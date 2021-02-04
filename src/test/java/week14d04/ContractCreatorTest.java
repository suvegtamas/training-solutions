package week14d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractCreatorTest {

    @Test
    void createTest() {
        ContractCreator cc = new ContractCreator("John Doe", List.of(10,20,30,40,50,60,70));
        Contract second = cc.create("Jack Doe");
        Contract first = cc.create("Jane Doe");
        second.getMonthlyPrices().set(0,58);

        assertNotEquals(first,second);
        assertEquals(List.of(10,20,30,40,50,60,70),first.getMonthlyPrices());
        assertEquals(List.of(58,20,30,40,50,60,70),second.getMonthlyPrices());
    }
}