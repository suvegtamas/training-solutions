package exam03;

public enum CruiseClass {
    LUXURY(3.0),FIRST(1.8),SECOND(1.0);

    private double percent;

    CruiseClass(double percent) {
        this.percent = percent;
    }

    public double getLuxuryPrice(double basicPrice) {
        return LUXURY.percent * basicPrice;
    }
    public double getFirstClassPrice(double basicPrice) {
        return FIRST.percent * basicPrice;
    }
    public double getSecondClassPrice(double basicPrice) {
        return SECOND.percent * basicPrice;
    }

}
