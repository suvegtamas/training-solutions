package finalmodifier;

public class TaxCalculator {
    public static final double AFA = 27;

    public double tax(double price) {
        return price * AFA / 100;
    }
    public double priceWithTax(double price) {
        double withTax = price + tax(price);
        return withTax;
    }

    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();
        System.out.println(tax.tax(100000));

        System.out.println(tax.priceWithTax(100000));
    }
}
