package week06d04.junior;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    @Test
    void getByMonthTest() {
        List<Item> items = Arrays.asList(new Item("test1",2,1200),
                    new Item("test2",3,1200),
                    new Item("test3",4,1200));
        Budget b = new Budget(items);

        assertEquals(Arrays.asList("test2 3 1200") ,b.getItemByMonth(3));

    }
    @Test
    void ifNameIsWrongTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(Arrays.asList(new Item("", 2, 3))));
        assertEquals("Name must be given",ex.getMessage());
    }
}
