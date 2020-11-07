package mathrandom.RoundingAnomaly;

import java.util.Random;

public class RoundingAnomaly {
   private double[] randomNumbers(int size, double max, int scale) {
       double[] numbers = new double[size];
       Random random = new Random();
       double exp = Math.pow(10,scale);
       for (int i = 0; i < size; i++) {
          double output = Math.round(random.nextDouble() * max * exp) / exp ;
          numbers[i] = output;
       }
       return numbers;


   }
   private double roundAfterSum(double[] numbers) {
      double sum = 0;
      for (double item : numbers ) {
         sum = sum + item;
      }
      return Math.round(sum);
   }

   private double sumAfterRound(double[] numbers) {
      double sum = 0;
      for (double item : numbers) {
         sum = sum + Math.round(item);
      }
      return sum;
   }
   private double difference(int size, double max, int scale) {
      double[] arrayNumbers = randomNumbers(size, max, scale);
      double resultRoundAfterSum = roundAfterSum(arrayNumbers);
      double resultSumAfterRound = sumAfterRound(arrayNumbers);

      return Math.abs(resultRoundAfterSum - resultSumAfterRound);

   }

   public static void main(String[] args) {
      RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
      double sum = 0;
      for (double i = 0; i < 100; i++) {
         double difference = roundingAnomaly.difference(1000,1_000_000,5);
         sum = sum + difference;
         System.out.println("Difference: " + difference);
      }
      System.out.println(sum / 100);
   }
}
