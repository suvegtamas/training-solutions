package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {
        WhichType type = new WhichType();

        System.out.println(type.whichType(Long.toString(Long.MAX_VALUE)));
        System.out.println(type.whichType(Long.toString((long)Integer.MAX_VALUE)));
        System.out.println(type.whichType(Long.toString((long)Short.MAX_VALUE)));
        System.out.println(type.whichType(Long.toString((long)Byte.MAX_VALUE)));
        System.out.println(type.whichType(Long.toString(0)));
    }
}
