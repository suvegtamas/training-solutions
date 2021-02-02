package week14d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OnlineShoppingTest {

    OnlineShopping os = new OnlineShopping();
    Path file = Path.of("src/main/resources/shopping.txt");
    @BeforeEach
    void setUp() {
        os.readFile(file);
    }


    @Test
    void getItemById() {
        List<String> result = os.getItemById("B3402");
        assertEquals(List.of("bbq_sauce", "cola", "meet", "soda"), result);
    }

    @Test
    void getItemByIdReversed() {
        List<String> resultReverse = os.getItemByIdReversed("B3402");
        assertEquals(List.of("soda","meet","cola","bbq_sauce"),resultReverse);
    }

    @Test
    void getNumberOfItemsSell() {
    int resultCount = os.getNumberOfItemsSell("tomato");
    assertEquals(2,resultCount);
    }

    @Test
    void getNumberOfItemsById() {
        int sizeList = os.getNumberOfItemsById("B3402");
        assertEquals(4,sizeList);
    }

    @Test
    void shoppingListStatistics() {
        Map<String,Integer> resultMap = os.shoppingListStatistics();
        assertEquals(2,resultMap.get("rosmary").intValue());
    }
    
}