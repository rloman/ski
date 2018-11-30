package nl.workingspirit.ski.iterator;

public class Application {

   public static void main(String[] args) {

      Iterable<Integer> squareIterable = new SquareIterator(0, 10);

      for (int square : squareIterable) {

         System.out.println(square);

      }

      for (int square : squareIterable) {
         

         System.out.println(square);

      }

   }

}
