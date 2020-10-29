package classstructurecontructors;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Name: ");
        String name = scanner.nextLine();

        System.out.println("Product Price: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increasePrice(23);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decreasePrice(20);
        System.out.println(product.getName() + " " + product.getPrice());


    }
}
