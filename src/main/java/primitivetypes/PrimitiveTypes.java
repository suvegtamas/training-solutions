package primitivetypes;

public class PrimitiveTypes {
    public String toBinaryString(int n) {
        String s = "";
        while(n>0) {
            s =((n%2) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        String result = String.format("%32s",s).replaceAll("","0");
        return result;
    }
}
