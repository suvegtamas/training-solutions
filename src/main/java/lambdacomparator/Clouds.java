package lambdacomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {
    public CloudStorage alphabeticallyFirst(List<CloudStorage> clouds) {
        clouds.sort(Comparator.comparing(c -> c.getProvider().toLowerCase()));
        return clouds.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> clouds) {
        return Collections.min(clouds, Comparator.comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))).thenComparingDouble(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> clouds) {
        List<CloudStorage> copyStorages = new ArrayList<>(clouds);
        copyStorages.sort(Comparator.reverseOrder());
        return copyStorages.subList(0, Math.min(copyStorages.size(), 3));
    }
}
