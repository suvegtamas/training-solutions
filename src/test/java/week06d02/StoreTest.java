package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    void productCountByCategoryTest() {
        Store store = new Store(Arrays.asList(new Product("Alma","Fruits",1200),
                                              new Product("Alma","Fruits",1200)));


        assertEquals(2,store.getProductByCategoryName("Fruits"));



    }
}
