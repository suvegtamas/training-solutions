package week08d01;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    @Test
    void testCreate() {
        Robot robot = new Robot(0,0);
        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());

    }
    @Test
    void testMoveRobot() {
        Robot robot = new Robot(0,0);
        Robot result = robot.move("FFLLLLLBBBBJJJJJJJ");
        assertEquals("Robot{x=-3, y=3}", result.toString());
    }
}
