package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator();
        System.out.println(circle.calculateArea(8));
        System.out.println(circle.calculatePerimeter(6));

        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println(cylinder.calculateVolume(8, 6));
        System.out.println(cylinder.calculateSurfaceArea(7,4));

        System.out.println(CircleCalculator.MATH_PI);
    }
}
