package week10d05;

import java.util.Arrays;


public class Calculator {


    public int findMinSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array not given or has no elements");
        }
        int sum = 0;
        Arrays.sort(arr);
        int result = Math.min(arr.length,4);
        for (int i = 0; i < result; i++) {
            sum += arr[i];
        }
        return sum;
    }
    /**
     Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
     A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni
     az arr tömb elemeiből. Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16. */
}
