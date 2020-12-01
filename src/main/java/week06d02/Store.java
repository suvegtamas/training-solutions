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

    public static void main(String[] args) {
        Store store = new Store(Arrays.asList(new Product("Alma","Fruits",1200),
                new Product("Alma","Fruits",1200)));


        System.out.println(store.getProductByCategoryName("Fruits"));
    }
}
