package week08d05;

public class MathAlgorithms {

   public int greatestCommonDivisor(int first, int second ) {
       if(first == 0 || second == 0) {
           throw new IllegalArgumentException("Division by 0.");
       }
       int common = 1;
       for (int i = 1; i <=first && i<=second; i++) {
           if ( first % i == 0 && second % i == 0) {
               common = i;
           }
       }
       return common;
   }

   /**  készíts egy osztályt MathAlgorithms néven. Legyen benne egy metódus,
     * greatestCommonDivisor() , ami paraméterül vár két pozitív egész számot és
     * visszaadja a legnagyobb közös osztójukat.*/
}
