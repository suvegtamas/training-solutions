package iofilestest;

public class Cheese {
    private final String name;
    private final double lactose;

    public Cheese(String name, double lactose) {
        this.name = name;
        this.lactose = lactose;
    }

    public String getName() {
        return name;
    }

    public double getLactose() {
        return lactose;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", lactose=" + lactose +
                '}';
    }
}
