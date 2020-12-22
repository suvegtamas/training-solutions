package week09d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {

    public long sumEvens(int bound) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        int i = 1;
        while(i<=bound) {
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
            if (num1 % 2 == 0) {
                sum += num1;
            }

        }
        return sum;
    }
}
