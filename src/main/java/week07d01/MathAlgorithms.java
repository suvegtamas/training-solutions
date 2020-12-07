package week07d01;

public class MathAlgorithms {
    public boolean isPrime(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Parameter must be positive.");
        }
        boolean prime = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                prime = false;
            }

        }
        return prime;
    }

    public static void main(String[] args) {
        MathAlgorithms ma = new MathAlgorithms();
        boolean a = ma.isPrime(32);
        System.out.println(a);
    }
}
