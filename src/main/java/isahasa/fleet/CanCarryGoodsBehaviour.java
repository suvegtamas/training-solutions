package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int cantFit = 0;
        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            cantFit = cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }
        return cantFit;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
