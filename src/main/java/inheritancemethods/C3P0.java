package inheritancemethods;

import java.util.ArrayList;
import java.util.List;

public class C3P0 implements MovableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    @Override
    public List<Point> getPath() {
        return path;
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }
    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public C3P0(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }
}
