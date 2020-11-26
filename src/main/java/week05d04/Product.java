package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate exp;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        exp = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExp() {
        return exp;
    }

    public static void main(String[] args) {
        Product product = new Product("test", 2020, 12, 01);
        System.out.println(product.getExp());
    }
}
