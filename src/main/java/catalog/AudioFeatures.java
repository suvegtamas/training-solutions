package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
   private List<String> composer = new ArrayList<>();
   private int length;
   private List<String> performer = new ArrayList<>();
   private String title;


    public AudioFeatures(String title,int length, List<String> composer) {
        if (Validators.isBlank(title) || Validators.isEmpty(composer)|| length < 0) {
            throw new IllegalArgumentException("");
        }
        this.length = length;
        this.composer = composer;
        this.title = title;
    }

    public AudioFeatures(String title,int length, List<String> composer, List<String> performer) {
        this.performer = performer;
        this.length = length;
        this.composer = composer;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        result.addAll(performer);
        result.addAll(composer);
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
