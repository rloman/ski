package nl.example.app.recursion;

public class Fac {

   public static int fac(int n) {

      // simplest case
      if (n == 0) {
         return 1;
      }
      else {
         return n * fac(n - 1);
      }
   }

}
