package week07d02;

public class DigitSum {
    public int sumOfDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }



    //    Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metóódus mely visszaadja a paraméterül
   //    kapott szám számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6.
}
