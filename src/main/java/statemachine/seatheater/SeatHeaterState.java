package statemachine.seatheater;

public enum SeatHeaterState {
    OFF{
        @Override
        public SeatHeaterState next() {
            return THREE;
        }
    },THREE {
        @Override
        public SeatHeaterState next() {
            return TWO;
        }
    },TWO {
        @Override
        public SeatHeaterState next() {
            return ONE;
        }
    },ONE {
        @Override
        public SeatHeaterState next() {
            return OFF;
        }
    };
    abstract public SeatHeaterState next();
}
