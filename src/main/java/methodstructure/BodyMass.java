package methodstructure;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public BmiCategory body() {
        double bmi = bodyMassIndex();
        if ( bmi < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (bmi > 25.0) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }
    public boolean isThinnerThan(BodyMass bm) {
        return bodyMassIndex() < bm.bodyMassIndex();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    public double bodyMassIndex() {
        return weight / (height * height);
    }
}
