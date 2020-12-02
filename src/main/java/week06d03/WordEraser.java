package week06d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordEraser {
    public String eraseWord(String words, String word) {
     Scanner sc = new Scanner(words);
     while(sc.hasNext()) {
         if ( sc.next().equals(word)) {
             sc.remove();
         }
     }

     return // nem tudom mi kellene ide;

    }

    public static void main(String[] args) {
        WordEraser we = new WordEraser();
        System.out.println(we.eraseWord("alma banan alma", "alma"));
    }
}
