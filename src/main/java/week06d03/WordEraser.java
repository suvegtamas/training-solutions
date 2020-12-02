package week06d03;


import java.util.Scanner;

public class WordEraser {
    public String eraseWord(String words, String word) {
     Scanner sc = new Scanner(words);
     StringBuilder sb = new StringBuilder();
     while(sc.hasNext()) {
         String s = sc.next();
         if ( !s.equals(word)) {
             sb.append(s).append(" ");
         }
     }
        return sb.toString().trim();
    }

}
