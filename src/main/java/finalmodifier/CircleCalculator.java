package finalmodifier;

public class CircleCalculator {
    public static final double MATH_PI = 3.14;

    public double calculatePerimeter(double r) {
        return 2 * MATH_PI * r;
    }
    public double calculateArea(double r) {
        return MATH_PI * (r*r);
    }


}
