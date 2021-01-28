package ioconvert.products;

import java.io.*;
import java.util.List;

public class ProductWriter {
    public void saveProduct(OutputStream os, List<Product> products) {
        PrintStream ps = new PrintStream(os);
        for(Product p : products) {
            ps.print(p.getName());
            ps.print(";");
            ps.print(p.getAmount());
            ps.println();
        }
    }
}
