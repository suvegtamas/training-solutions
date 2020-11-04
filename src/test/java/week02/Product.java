package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    public boolean areTheyEqual(Product p) {
        boolean areNameEqual = name.equals(p.name);
        boolean isLenghtOk = code.length() - p.code.length() <= 1 && code.length() - p.code.length() >= -1;
        return areNameEqual && isLenghtOk;
    }

    public static void main(String[] args) {
        Product product = new Product("Nike", "223");
        Product product1 = new Product("Nike", "223");
        Product product2 = new Product("Addidas", "224");

        System.out.println(product.areTheyEqual(product1));
        System.out.println(product.areTheyEqual(product2));

    }
}
