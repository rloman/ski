package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TableTools {

   private boolean goalReached = false;
   
   private Integer[] tables;

   public List<Integer> solve(int guests, boolean exactMatch) {

      if(exactMatch) {
         NavigableSet<Integer> availableTables = new TreeSet<>();
         availableTables.addAll(Arrays.asList(this.tables));
         return this.solveRecursive(guests, availableTables);
         
      }
      else {
         for (int i = 0; i < 5; i++) {
            NavigableSet<Integer> availableTables = new TreeSet<>();
            availableTables.addAll(Arrays.asList(this.tables));
            List<Integer> result = this.solveRecursive(guests + i, availableTables);
            if (!result.isEmpty()) {
               System.out.println(result);
               return result;
            }
         }

         return new ArrayList<>();
      }
   }
   
   private void foo() {
      ArrayList l;
      ArrayList l2;
      
   }

   private List<Integer> solveRecursive(int guests, NavigableSet<Integer> availableTables) {

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         goalReached = true;

      }
      else {
         if (!goalReached) {
            Integer element = availableTables.floor(guests);
            if (element != null) {
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
      return result;
   }

   // this is dynamic and should have be get each call since this is a simulated database call
   // and let it be clear that remove some from the availableTables above is NOT TO BE PERSISTED to a DB
   public void setAvailableTables(Integer... tables) {
      this.tables = tables;
   }

}
