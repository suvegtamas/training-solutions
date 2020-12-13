package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    protected Point position;
    private int hitPoint = 100;

    protected Random random = new Random();
    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }
    protected int getActualPrimaryDamage() {
        return random.nextInt(10 - 1) + 1;
    }
    private int getActualDefence() {
        return random.nextInt(5);
    }
    protected void hit(Character enemy, int damage) {
        int defence = enemy.getActualDefence();
        if ( defence < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }
    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());

    }
    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }
    abstract public void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
