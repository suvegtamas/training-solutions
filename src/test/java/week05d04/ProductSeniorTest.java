package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductSeniorTest {
    @Test
    void isCurrencyAccepted() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ProductSenior(150, "HF"));
        assertEquals("Only HUF and USD is accepted.", ex.getMessage());
    }

    @Test
    void hufToUsdTest() {
        assertEquals(150, new ProductSenior(45000,"HUF").convertCurrency("USD"));
    }
    @Test
    void usdToHufTest() {
        assertEquals(45000,new ProductSenior(150,"USD").convertCurrency("HUF"));

    }
}
