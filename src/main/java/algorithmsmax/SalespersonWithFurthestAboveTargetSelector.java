package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespeople) {
        Salesperson sp = null;
        for ( Salesperson s : salespeople) {
            if (sp == null || s.getDifferenceFromTarget() > 0 && s.getDifferenceFromTarget() > sp.getDifferenceFromTarget()) {
                sp = s;
            }
        }
        return sp;
    }
}
