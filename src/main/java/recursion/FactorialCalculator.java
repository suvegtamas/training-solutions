package recursion;

public class FactorialCalculator {
    public long getFactorial(int n) {
        if (n > 1) {
            long result = getFactorial(n - 1);
            return n * result;
        } else {
            return 1;
        }
    }
}
