package inheritanceattributes;

public class ShippedBook extends Book {
    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        int result = super.purchase(pieces) + shippingCost;;
        if ( pieces >= 2) {
            result = super.purchase(pieces);
        }
        return result;
    }

    @Override
    public String toString() {
        return getTitle() + ":" + price + " - " + shippingCost;
    }
}
