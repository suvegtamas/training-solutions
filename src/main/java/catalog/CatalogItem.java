package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature f : feature) {
            features.add(f);
        }
    }

    public int fullLengthAtOneItem() {
        int length = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                length += ((AudioFeatures) feature).getLength();
            }
        }
        return length;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.addAll(feature.getContributors());
        }
        return result;
    }
    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.add(feature.getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if ( feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }
    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if ( feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
    public int numberOfPagesAtOneItem() {
        int pages = 0;
        for (Feature feature : features) {
            if ( feature instanceof PrintedFeatures) {
                pages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return pages;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
