package attributes.bill;

import java.util.ArrayList;
import java.util.List;


public class Bill {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice = item.getQuantity() * item.getPrice() + totalPrice;
        }
        return totalPrice;
    }
}
