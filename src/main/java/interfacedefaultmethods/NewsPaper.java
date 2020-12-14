package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {
   private List<String> pageContent = new ArrayList<>();

    @Override
    public int getLength() {
        return pageContent.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pageContent.get(pageNumber);
    }
    public void addPage(String page) {
        pageContent.add(page);
    }
}
