package mathrandom.game;

import mathrandom.Point;

import java.util.Random;

public class Warrior {
    private final Random rnd = new Random();


    private String name;
    private int stamina;
    private double skill;
    private Point position;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rnd.nextInt(81) + 20;
        skill = rnd.nextDouble();

    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior changePos) {
        int changePosX = position.getX();
        int changePosY = position.getY();

        if ( changePos.getPosition().getX() - position.getX() > 0) {
            changePosX++;
        } else if (changePos.getPosition().getX() - position.getX() < 0) {
                changePosX--;
            }


        if ( changePos.getPosition().getY() - position.getY() > 0) {
            changePosY++;
        } else if ( changePos.getPosition().getY() - position.getY() < 0 ){
            changePosY--;

        }
        position = new Point(changePosX, changePosY);



    }

    public double distance(Warrior other) {
        return position.distance(other.position);
    }

    public boolean isAlive() {
        return stamina > 0;
    }
    public String toString() {
        return name + " : (" + position.getX() + "," + position.getY()  + " ) " +  stamina;
    }

    public void attack(Warrior other) {
        double randNum = rnd.nextDouble();
        int minus = rnd.nextInt(3) + 1;
        if ( randNum < skill) {
            other.stamina = other.stamina - minus;
        }

    }
}
