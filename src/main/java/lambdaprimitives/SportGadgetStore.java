package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }



    public List<Product> getProducts() {
        return products;
    }

    public int getNumberOfProducts() {
        return products.stream().mapToInt(p -> p.getAmount()).sum();
    }

    public double getAveragePrice() {
        return products.stream().mapToDouble(p -> p.getPrice()).summaryStatistics().getAverage();
    }

    public String getExpensiveProductStatistics(double v) {
        IntSummaryStatistics stats = products.stream().filter(p -> p.getPrice() > v).mapToInt(p -> p.getAmount()).summaryStatistics();
        long allProducts = stats.getCount();
        int min = stats.getMin();
        int max = stats.getMax();
        long sum = stats.getSum();
        if(stats.getCount() > 0) {
            return String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",allProducts,min,max,sum);
        }
        return "Nincs ilyen termék.";
    }
}
