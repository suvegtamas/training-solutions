package catalog;

import interfacestaticmethods.Valued;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();


    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if ( numberOfPages < 0 || Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("");
        }

        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
