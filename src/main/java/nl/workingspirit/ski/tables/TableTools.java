package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TableTools {

   private NavigableSet<Integer> availableTables = new TreeSet<>((n,m) -> m-n);

   public boolean goalReached = false;

   public List<Integer> solve(int guests) {

      for (int i = 0; i < 3; i++) {
         List<Integer> result = this.solveRecursive(guests + i);
         if (!result.isEmpty()) {
//            System.out.println(result);
            return result;
         }
      }

      return new ArrayList<>();
   }

   private List<Integer> solveRecursive(int guests) {

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         goalReached = true;

      }
      else {
         if (!goalReached) {
            Integer element = this.availableTables.floor(guests);
            // for (int element : availableTables) {
            if (element != null && element < guests  && !goalReached ) {
               availableTables.remove(element);
               List<Integer> subList = solveRecursive(guests - element);

               // apparently there is a solution for the smaller value so now please at the element since I can make a (recursive) solution here, what I did above.
               if (!subList.isEmpty()) {
                  result.add(element);
                  result.addAll(subList);
               }
            }
            // }
         }
      }
      return result;
   }

   // this is dynamic and should have be get each call since this is a simulated database call
   // and let it be clear that remove some from the availableTables above is NOT TO BE PERSISTED to a DB
   public void setAvailableTables(Integer... tables) {
      
      this.availableTables.addAll(Arrays.asList(tables));
      System.out.println(this.availableTables);
   }

}
