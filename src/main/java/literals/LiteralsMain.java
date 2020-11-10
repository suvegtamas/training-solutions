package literals;

public class LiteralsMain {
    private String textAdder = "1" + "2";
    private double quotient = 3 / 4;
    private long big = 3_244_444_444L;
    String s = "árvíztűrőtükörfúrógép";
    String word = "TITLE";

    public String getTextAdder() {
        return textAdder;
    }

    public double getQuotient() {
        return quotient;
    }

    public long getBig() {
        return big;
    }

    public String getS() {
        return s;
    }

    public String getWord() {
        return word;
    }

    public static void main(String[] args) {
        LiteralsMain literals = new LiteralsMain();
        System.out.println(literals.getQuotient());
        System.out.println(literals.getWord().toUpperCase());
        Integer n1 = 1;
        Integer n2 = -2;
        System.out.println(n1.byteValue());
        System.out.println(n2.byteValue());

    }
}
