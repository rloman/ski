package nl.workingspirit.ski.recursion.priemontbinding;

import java.util.ArrayList;
import java.util.List;

public class PriemOntbindingSimpler {


   public List<Integer> po(int n) {

      List<Integer> factorList = po(2, n, new ArrayList<>());
      
      return factorList;

   }

   private List<Integer> po(int lastFactor, int n, List<Integer> factors) {


      //simplest case?
      if(lastFactor == n) {
         factors.add(lastFactor);
         
         return factors;
      }
      
      // if n is divisible to lastFactor add it to the List of factors
      if (n % lastFactor == 0) {
         factors.add(lastFactor);
         po(lastFactor, n / lastFactor, factors);
      }
      // if not; increment the lastFactor by 1 and retry
      else {
         if (lastFactor < n) {
            po(++lastFactor, n, factors);
         }
      }

      return factors;
   }

}