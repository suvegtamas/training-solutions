package exceptions.polinom;

public class Polynomial {
    private final double[] coefficients;
    public Polynomial(double[] coefficients) {
        if(coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientStrs) {
        if (coefficientStrs == null)
            throw new NullPointerException("coefficientStrs is null");
        try {
            this.coefficients = convert(coefficientStrs);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", e);
        }
    }

    public double evaluate(double x) {
        int n = coefficients.length-1;
        double sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += coefficients[i] * Math.pow(x,(double)n - i);
        }
        return sum;
    }
    public double[] convert(String[] coefficientsStr) {
        double[] coefficients = new double[coefficientsStr.length];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = Double.parseDouble(coefficientsStr[i]);
        }
        return coefficients;
    }

    public double[] getCoefficients() {
        return coefficients;
    }
}
