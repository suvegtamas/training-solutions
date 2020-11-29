package algorithmsmax;

public class Salesperson {
    private String name;
    private int amount;
    private int target;

    public Salesperson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }
    public int getDifferenceFromTarget() {
        int result = 0;
        if ( target > amount) {
            result =target - amount;
        } else {
            result = amount - target;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }
}
