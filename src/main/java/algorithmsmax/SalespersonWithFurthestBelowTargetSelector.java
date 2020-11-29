package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> persons) {
        Salesperson sp = null;
        for (Salesperson s : persons) {
            if ( sp == null || (s.getDifferenceFromTarget() < 0 && s.getDifferenceFromTarget() < sp.getDifferenceFromTarget())) {
                sp = s;
            }
        }
        return sp;
    }
}
