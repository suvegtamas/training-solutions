package week05d04;

public class ProductSenior {
    private long price;
    private String currency;

    public ProductSenior(long price, String currency) {
        isCorrectCurrency(currency);
        this.price = price;
        this.currency = currency;
    }
    public double convertCurrency(String currency) {
        if ("USD".equals(currency)) {
            return price / 300.0;
        } else {
            return price * 300.0;

        }

    }
    public void isCorrectCurrency(String currency) {
        if (!"HUF".equals(currency) && !"USD".equals(currency)) {
            throw new IllegalArgumentException("Only HUF and USD is accepted.");
        }
    }

    public static void main(String[] args) {
        ProductSenior ps = new ProductSenior(150, "HUF");

        System.out.println(ps.convertCurrency("USD"));
    }
}
