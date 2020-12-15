package statemachine.trafficlight;


public enum TrafficLight {
    RED {
        @Override
        public TrafficLight next() {
            return RED_YELLOW;
        }
    }, RED_YELLOW {
        @Override
        public TrafficLight next() {
            return GREEN;
        }
    }, GREEN {
        @Override
        public TrafficLight next() {
            return YELLOW;
        }
    }, YELLOW {
        @Override
        public TrafficLight next() {
            return RED;
        }
    };

    abstract public TrafficLight next();
}
