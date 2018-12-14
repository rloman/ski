package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Application {

   public static boolean goalReached = false;

   public static void main(String[] args) {

      Queue<Integer> atables = new ConcurrentLinkedQueue<>();
      atables.addAll(Arrays.asList(6, 5, 4, 3, 2, 1));
      // atables.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

      // Collections.sort(atables);

      List<Integer> result = solve(21, atables);
      System.out.println(result);

   }

   public static List<Integer> solve(int guests, Queue<Integer> availableTables) {

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         // availableTables.remove(guests);
         goalReached = true;

      }
      else {
         for (int element : availableTables) {
            if (element < guests && !goalReached) {
               availableTables.remove(element);
               List<Integer> subList = solve(guests - element, availableTables);

               // apparently there is a solution for the smaller value so now please at the element since I can make a (recursive) solution here, what I did above.
               if (!subList.isEmpty()) {
                  result.add(element);
                  result.addAll(subList);
               }
            }
         }
      }
      return result;
   }

}
