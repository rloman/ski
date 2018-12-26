package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TableTools {
   
   private Queue<Integer> availableTables = new ConcurrentLinkedQueue<>();
   
   public boolean goalReached = false;
   
   public List<Integer> solve(int guests) {

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         goalReached = true;

      }
      else {
         if(!goalReached) {
            for (int element : availableTables) {
               if (element < guests && !goalReached) {
                  availableTables.remove(element);
                  List<Integer> subList = solve(guests - element);

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
   public void setAvailableTables(Integer ... tables) {
      List<Integer> tableList = Arrays.asList(tables);
      tableList.sort((n,m ) -> m -n );
      this.availableTables.addAll(tableList);
   }

}
