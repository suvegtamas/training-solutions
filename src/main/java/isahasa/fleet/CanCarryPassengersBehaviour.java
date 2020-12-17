package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
   private int passengers;
   private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int cantFit = 0;
        if (passengers <= maxPassengers) {
            this.passengers = passengers;
        } else {
            cantFit = passengers - maxPassengers;
            this.passengers = maxPassengers;
        }



        return cantFit;
    }


}
