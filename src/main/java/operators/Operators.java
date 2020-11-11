package operators;

public class Operators {

    public boolean isEven(int n) {
        if ( n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }
        return false;
    }
    public int multiplyByPowerOfTwo(int number, int power) {
        return number << power;
    }

}
