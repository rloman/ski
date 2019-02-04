package nl.example.app.recursion.priemontbinding;

import java.util.ArrayList;
import java.util.List;

public class PriemOntbindingSimpler {


   public List<Integer> po(int n) {

      List<Integer> factorList = po(2, n);
      
      return factorList;

   }

   private List<Integer> po(int lastFactor, int n) {

      List<Integer> result = new ArrayList<>();

      //simplest case!
      if(lastFactor == n) {
         result.add(lastFactor);
      }
      else {
         // if n is divisible to lastFactor add it to the List of factors and recursively po
         
         if (n % lastFactor == 0) {
            
            result.add(lastFactor);
            
            result.addAll(po(lastFactor, n / lastFactor));
         }
         
         // if not; increment the lastFactor by 1 and retry the recursive po
         else {
            if (lastFactor < n) {
               return po(++lastFactor, n);
            }
         }

      }

      return result;
   }

}