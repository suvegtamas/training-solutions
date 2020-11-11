package controlselection.accents;

public class WithoutAccents {
    public static final String LETTERS_WITH_ACCENTS = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
    public static final String LETTERS_WITHOUT_ACCENTS = "aeiooouuuAEIOOOUUU";

    public char withoutAccents(char c) {
        int  i = LETTERS_WITH_ACCENTS.indexOf(c);
        if ( i >= 0) {
            return LETTERS_WITHOUT_ACCENTS.charAt(i);
        } else {
            return c;
        }
    }
}
