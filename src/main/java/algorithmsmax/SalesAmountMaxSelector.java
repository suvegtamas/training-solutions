package algorithmsmax;

import java.util.List;

public class SalesAmountMaxSelector {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople) {
        Salesperson salesPersonWithMaxAge = null;
        for (Salesperson s : salespeople) {
            if ( salesPersonWithMaxAge == null || s.getAmount() > salesPersonWithMaxAge.getAmount()) {
                salesPersonWithMaxAge = s;
            }
        }
        return salesPersonWithMaxAge;
    }
}
