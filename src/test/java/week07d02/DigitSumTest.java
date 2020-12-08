package week07d02;

import org.junit.jupiter.api.Test;
import week07d02.DigitSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {
    public static void main(String[] args) {
        DigitSum ds = new DigitSum();
        int sum = ds.sumOfDigits(123);
        System.out.println(sum);
    }
    @Test
    void adderTest() {
        assertEquals(6,new DigitSum().sumOfDigits(123));
        assertEquals(3,new DigitSum().sumOfDigits(12));
        assertEquals(21,new DigitSum().sumOfDigits(123456));
        assertEquals(6,new DigitSum().sumOfDigits(0204));
    }
}

