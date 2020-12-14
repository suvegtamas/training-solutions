package week08d01;

public class Robot {
    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Robot move(String toPos) {
        for ( int i = 0; i < toPos.length(); i++) {
            char actual = toPos.charAt(i);
            switch (actual) {
                case 'F':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'B':
                    y--;
                    break;
                case 'J':
                    y++;
                    break;
                default:
                    throw new IllegalArgumentException("No such position!");
            }
        }
        return new Robot(x,y);
    }
    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
