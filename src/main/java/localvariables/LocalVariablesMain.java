package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        b = false;
        int a = 2;
        int i = 3; int j = 4;
        int k;
        k = i;
        String s;
        s = "Hello World!";
        String t;
        t = s;
        System.out.println(b);

        {
            int x = 0;
            System.out.println(a);

        }

    }

}
