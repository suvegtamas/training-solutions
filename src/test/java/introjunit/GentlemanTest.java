package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void sayHelloTest() {

            // Given
            String name = "John";

            // When
            String greeting = new Gentleman().sayHello(name);

            // Then
            assertEquals("Hello John", greeting);

    }


}
