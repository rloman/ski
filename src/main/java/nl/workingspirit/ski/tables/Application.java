package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Application {

   private static Queue<Integer> tables = new ConcurrentLinkedQueue<>();
   
   public static boolean found = false;

   static {

      tables.addAll(Arrays.asList(4, 3, 2, 1));
   }

   public static void main(String[] args) {

      List<Integer> result = new ArrayList<>();

      solve(5, result);
      System.out.println(result);

   }

   public static void solve(int guests, List<Integer> result) {
      System.out.println("Current available tables:"+tables);

      if (tables.contains(guests)) {
         System.out.println("Tables contain guest:"+guests);
         result.add(guests);
         tables.remove(guests);
         found = true;
         
         return;
      }
      else {
         for (int element : tables) {
            if(found) {
               return;
            }

            if (element < guests) {
               result.add(element);
               tables.remove(element);
               solve(guests - element, result);
            }
         }
      }

   }

}
