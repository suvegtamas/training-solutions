package stringbasic;

public class StringCreator {
    public String createStringForHeap() {
        return new String("random");
    }

    public String createStringForPool() {
        return "random";
    }
}
