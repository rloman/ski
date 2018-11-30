package nl.workingspirit.ski.recursion;


public class Fac {
   
   public static int fac(int n) {
      
      // simplest case
      if(n == 0) {
         return 1;
      }
      else {
//         int simplerVersion = n-1;
         return n * fac(n-1);
      }
   }

}
