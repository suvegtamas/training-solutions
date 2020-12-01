package week06d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
   private  List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(String cname) {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory().equals(cname)) {
                count++;
            }
        }
        return count;
    }


}
