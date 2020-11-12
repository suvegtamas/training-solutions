package controliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {

    @Test
    public void dictionaryTest() {
        //Given
        Dictionary d = new Dictionary();
        d.addItem("alma", Arrays.asList("apple"));
        d.addItem("korte", Arrays.asList("pear"));
        d.addItem("korte", Arrays.asList("pear"));

       List<String> translations = d.findTranslations("alma");
       assertEquals("apple", translations);
    }
}
