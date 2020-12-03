package week06d04.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    List<Item> shopList = new ArrayList<>();

    public ShoppingCart(List<Item> shopList) {
        this.shopList = shopList;
    }

    public void addItem(String name, int quantity) {
        boolean found = false;
        for (Item i : shopList) {
            if (i.getName().equals(name)) {
                int q = i.getQuantity() + quantity;
                i.setQuantity(q);
                found = true;
            }
            if (found == false) {
                shopList.add(new Item(name, quantity));
            }

        }

    }
    public int getItem(String name) {
        int q = 0;
        for (Item i : shopList) {
            if (i.getName().equals(name)) {
                q = i.getQuantity();
            }
        }
        return q;
    }

    @Override
    public String toString() {
        return "ShopList" + " " + shopList;

    }

}
