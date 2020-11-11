package controlselection.consonant;

public class ToConsonant {
    public static final String MHANGZO = "aeiou";

    public char toConsonant(char c) {
        if (MHANGZO.indexOf(c) >= 0) {
            return (char) (c+1);
        } else {
            return c;
        }
    }
}
