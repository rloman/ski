package nl.workingspirit.ski.recursion.radix;

import java.util.HashMap;
import java.util.Map;

public class Radixer {

   private static final Map<Integer, String> translator = new HashMap<Integer, String>();

   static {
      translator.put(10, "A");
      translator.put(11, "B");
      translator.put(12, "C");
      translator.put(13, "D");
      translator.put(14, "E");
      translator.put(15, "F");
   }

   public String radixBinair(int m) {
      return radix(m, 2);
   }

   public String radixOctal(int m) {
      return radix(m, 8);
   }

   public String radixHex(int m) {
      return radix(m, 16);
   }

   private String radix(int m, int radix) {
      if (m / radix == 0) {
         return (m % radix < 11) ? String.valueOf(m % radix) : locate(m % radix);
      }
      else {
         return radix(m / radix, radix) + radix(m % radix, radix);
      }
   }

   private String locate(int m) {

      return translator.get(m);
   }

}
