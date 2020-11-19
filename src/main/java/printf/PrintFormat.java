package printf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {
    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j) {
        try {
            return String.format(new Locale("hu", "HU"), formatString, i, j);
        } catch (MissingFormatArgumentException ex) {
            throw new IllegalArgumentException("Less objects then expected in format String!", ex);
        }
    }
    public String printFormattedText(Double number) {
       String total = "Total is: %,.2f Ft";
       return String.format(new Locale("hu","HU"),total, number);
    }
    public String printFormattedText(int count, String fruit) {
        String counted = "We counted %d %s in the basket";
        return String.format(new Locale("hu","HU"), counted, count , fruit);
    }
    public String printFormattedText(int number) {
        String formatted = "Right edge of numbers set at 4 spaces from text:%4d";
        return String.format(new Locale("hu","HU"), formatted, number);
    }
    public String printFormattedText(Integer i, Integer j, Integer k) {
        String formatted = "Multiple objects containing text:%d\t%d\t%d";
        return String.format(new Locale("hu","HU"), formatted, i, j, k);
    }
}
