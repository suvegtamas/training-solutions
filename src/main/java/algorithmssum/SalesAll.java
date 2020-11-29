package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAll {

    public int addToListAmount(List<Salesperson> salesAll) {
        int sum = 0;
        for(Salesperson salesperson : salesAll) {
            sum += salesperson.getAmount();
        }
        return sum;
    }

}
