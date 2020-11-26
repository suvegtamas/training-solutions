package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    void StoreTest() {
        //Given
        Store s = new Store();
        //When
        Product p = new Product("Tej", 2020, 05, 12);
        Product p2 = new Product("Tej", 2019, 05, 12);
        s.addProduct(p);
        s.addProduct(p2);
        //Then
        assertEquals(2 ,s.getNumberOfExpired());
    }
}
