package doublenumbers;

public class Circle {
    private static final double MATH_PI = 3.14;
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }
    public double perimeter() {
        return MATH_PI * diameter;
    }
    public double area() {
        return (MATH_PI / 4) * diameter * diameter;
    }
}
