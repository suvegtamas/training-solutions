package introinheritance;

public class ShoppingBasket {
    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }
    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }
    public double sumNettoPrice() {
        double sum = 0.0;
        for (Item item : basket.getItems()) {
            sum = sum + item.getNettoPrice();
        }
        return sum;
    }
    public double sumTaxValue() {
        double sum = 0.0;
        for (Item item : basket.getItems()) {
            sum = sum + item.getTaxAmount();
        }
        return sum;
    }
    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }
    public void checkout() {
        basket.clearBasket();
    }
    public String findMostExpensiveItem() {
        Item exp = basket.getItems().get(0);
        for (Item item : basket.getItems()) {
            if (item.getNettoPrice() > exp.getNettoPrice()) {
                exp = item;
            }
        }
        return exp.getBarcode();
    }
    public void removeMostExpensiveItem() {
        removeItem(findMostExpensiveItem());
    }
}
