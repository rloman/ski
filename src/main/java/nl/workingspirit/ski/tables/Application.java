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

      solve(11, result);
      System.out.println(result);

   }

   public static void solve(int guests, List<Integer> result) {
      
      if (tables.contains(guests)) {
         result.add(guests);
         found = true;
      }
      else {
         for (int element : tables) {
            System.out.println(tables);
            if (element < guests && !found && !tables.isEmpty()) {
               result.add(element);
               tables.remove(element);
               solve(guests - element, result);
            }
         }
      }

   }

}
