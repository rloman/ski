package nl.example.app.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TableTools {

   private boolean goalReached = false;

   private Integer[] tables;

   public List<Integer> solve(int guests, boolean exactMatch) {

      if (exactMatch) {
         Queue<Integer> availableTables = new ConcurrentLinkedQueue<>();
         List<Integer> tableList = Arrays.asList(tables);
         tableList.sort((n,m ) -> m -n );
         availableTables.addAll(tableList);
         return this.solveRecursive(guests, availableTables);

      }
      else {
         List<List<Integer>> integerListList = new ArrayList<>();
         for (int i = 0; i < 5; i++) {
            Queue<Integer> availableTables = new ConcurrentLinkedQueue<>();
            List<Integer> tableList = Arrays.asList(tables);
            tableList.sort((n,m ) -> m -n );
            availableTables.addAll(tableList);
            List<Integer> result = this.solveRecursive(guests + i, availableTables);
            if (!result.isEmpty()) {
               integerListList.add(result);
            }
         }
         return this.getListWithSmartestSeats(integerListList);
      }
   }

   private List<Integer> getListWithSmartestSeats(List<List<Integer>> integerListList) {

      long min = integerListList.get(0).stream().mapToInt(n -> n).sum();
      int resultIndex = 0;
      for (int i = 1; i < integerListList.size(); i++) {
         int localMin = integerListList.get(i).stream().mapToInt(n -> n).sum();
         if (localMin < min) {
            min = localMin;
            resultIndex = i;
         }
      }

      return integerListList.get(resultIndex);

   }

   //THE MAIN ALGORITHM. THE REST IF TO GET A LIST WHEN NO MATCH IS MADE
   private List<Integer> solveRecursive(int guests, Queue<Integer> availableTables) {

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         goalReached = true;

      }
      else {
         if (!goalReached) {
            for (Integer element : availableTables) {
               if (element < guests && !goalReached) {
                  availableTables.remove(element);
                  List<Integer> subList = solveRecursive(guests - element, availableTables);

                  // apparently there is a solution for the smaller value so now please at the element since I can make a (recursive) solution here, what I did above.
                  if (!subList.isEmpty()) {
                     result.add(element);
                     result.addAll(subList);
                  }
               }
            }
         }
      }
      return result;
   }

   // this is dynamic and should have be get each call since this is a simulated database call
   // and let it be clear that remove some from the availableTables above is NOT TO BE PERSISTED to a DB
   public void setAvailableTables(Integer... tables) {
      this.tables = tables;
   }

}
