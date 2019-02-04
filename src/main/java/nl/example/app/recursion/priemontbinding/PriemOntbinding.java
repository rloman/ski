package nl.example.app.recursion.priemontbinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PriemOntbinding {

   public String po(int n) {

      Map<Integer, Integer> counterMap = new TreeMap<>();
      List<Integer> factorList = po(2, n);

      for (Integer element : factorList) {

         if (counterMap.get(element) == null) {
            // init the map for element
            counterMap.put(element, 0);
         }
         counterMap.put(element, counterMap.get(element) + 1);
      }

      List<String> result = new ArrayList<>();
      for (Entry<Integer, Integer> element : counterMap.entrySet()) {
         if (element.getValue() == 1) {
            result.add(element.getKey().toString());
         }
         else {
            result.add(element.getKey() + "^" + element.getValue());
         }
      }

      return String.join("*", result);
   }

   private List<Integer> po(int lastFactor, int n) {

      List<Integer> result = new ArrayList<>();
      // simples case
      if (lastFactor == n) {
         result.add(lastFactor);
      }
      else {
         // if n is divisible to lastFactor add it to the List of factors
         if (n % lastFactor == 0) {
            result.add(lastFactor);
            result.addAll(po(lastFactor, n / lastFactor));
         }
         // if not; increment the lastFactor by 1 and retry
         else {
            if (lastFactor < n) {
               result.addAll(po(++lastFactor, n));
            }
         }

      }

      return result;
   }
}