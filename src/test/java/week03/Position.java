package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Position position1 = new Position("test1", 152_000);
        Position position2 = new Position("test2", 142_000);
        List<Position> positionList = new ArrayList<>();
        positionList.add(position1);
        positionList.add(position2);
        for (Position pos : positionList) {
            if ( pos.getBonus() > 150_000) {
                System.out.println(pos.getName() + " | " + pos.getBonus());
            }
        }
    }
}
