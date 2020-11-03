package stringtype;

import java.sql.SQLOutput;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String empty1 = "";
        String empty2 = "";
        System.out.println((empty1+empty2).length());

        String example = "abcde";
        System.out.println(example.length());
        System.out.println(example.substring(0,2));
        System.out.println(example.charAt(0) + " " + example.charAt(2));
    }



}
