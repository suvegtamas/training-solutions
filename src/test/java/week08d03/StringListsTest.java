package week08d03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {
   @DisplayName("Add values from a list to another")
    @Test
    void testListsUnited() {
       StringLists st = new StringLists();
       List<String> result = st.stringListsUnion(List.of("Alma", "Barack", "Banana"),List.of("Kabooza","Alma","Breki", "Barack", "Watermalone"));
       assertEquals("[Alma, Banana, Barack, Breki, Kabooza, Watermalone]",result.toString());
   }
   @Test
    void testListsUnited2() {
       StringLists st = new StringLists();
       List<String> result = st.stringListsUnion(List.of("Audi", "VW", "Volvo", "DAF"),List.of("Audi","BMW","daf"));
       assertEquals("[Audi, BMW, DAF, VW, Volvo, daf]",result.toString());
   }


}
