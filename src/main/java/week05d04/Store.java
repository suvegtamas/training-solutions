package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
       products.add(product);
    }

    public int getNumberOfExpired() {
        int count = 0;
        LocalDate date = LocalDate.now();
        for( Product p : products) {
            LocalDate n = p.getExp();
            if (n.isBefore(date)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return products.toString();
    }




}
