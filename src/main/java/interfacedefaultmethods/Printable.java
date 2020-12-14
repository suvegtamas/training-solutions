package interfacedefaultmethods;

public interface Printable {
   String DEFAULT_COLOR = "#000000";
    int getLength();
    String getPage(int pageNumber);
    default String getColor(int pageNumber) {
        return DEFAULT_COLOR;
   }
}
