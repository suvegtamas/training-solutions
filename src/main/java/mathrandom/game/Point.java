package mathrandom;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point other) {
        double powerOfTwo = Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2);
        return Math.sqrt(powerOfTwo);
    }
}
