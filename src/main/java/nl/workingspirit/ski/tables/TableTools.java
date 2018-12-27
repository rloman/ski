package nl.workingspirit.ski.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TableTools {

   private NavigableSet<Integer> availableTables = new TreeSet<>();
   private NavigableSet<Integer> availableTablesBackup  = new TreeSet<>();
   
   public boolean goalReached = false;

   public List<Integer> solve(int guests) {
      
      
      availableTablesBackup.addAll(this.availableTables);
      System.out.println(availableTables+":1:"+availableTablesBackup);

      for (int i = 0; i < 13; i++) {
         this.availableTables = new TreeSet<>();
         this.availableTables.addAll(this.availableTablesBackup);
         System.out.println(availableTables+":2:"+availableTablesBackup);
         List<Integer> result = this.solveRecursive(guests + i);
         if (!result.isEmpty()) {
            System.out.println(result);
            return result;
         }
      }

      return new ArrayList<>();
   }

   private List<Integer> solveRecursive(int guests) {
      System.out.println("Finding for: "+guests);

      List<Integer> result = new ArrayList<>();

      if (availableTables.contains(guests)) {
         result.add(guests);
         System.out.println("done");
         goalReached = true;

      }
      else {
         if (!goalReached) {
            Integer element = this.availableTables.floor(guests);
            if (element != null) {
               availableTables.remove(element);
               System.out.println(availableTables);
               List<Integer> subList = solveRecursive(guests - element);

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
      
      this.availableTables.addAll(Arrays.asList(tables));
      System.out.println(this.availableTables);
   }

}
