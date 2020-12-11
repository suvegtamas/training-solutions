package week06d04.senior;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @DisplayName("Add item to the ArrayList")
   @Test
    void addItemTest() {
       List<Item> items = new ArrayList<>();
       items.add(new Item("Alma", 3));
       items.add(new Item("Fuge", 6));
       items.add(new Item("Korte", 2));
       ShoppingCart sc = new ShoppingCart(items);
       sc.addItem("Alma", 7);

        assertEquals(10 , sc.getItem("Alma"));
    }

}
