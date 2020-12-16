package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{
    private Car car;

    public static final int MAX_CARRY_WEIGHT = 2000;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }
    public boolean canCarry(Car car) {
        return car.getGrossLoad() < MAX_CARRY_WEIGHT && car != null;
    }
    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }
    public boolean load(Car car) {
        if ( canCarry(car) ) {
            this.car = car;
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
