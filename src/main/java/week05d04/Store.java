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

    public static void main(String[] args) {
        Store s = new Store();
        Product p = new Product("Tej", 2020, 05, 12);
        Product p2 = new Product("Tej", 2019, 05, 12);
        s.addProduct(p);
        s.addProduct(p2);
        System.out.println(s.getNumberOfExpired());
    }


}
