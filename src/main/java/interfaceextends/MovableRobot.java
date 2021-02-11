package interfaceextends;

import java.util.List;

public interface MovableRobot{
    List<Point> getPath();
    void moveTo(Point position);
    void fastMoveTo(Point position);
    void rotate(int angle);

}
