package nl.example.app.recursion;

public class GgdKgv {

   // can explain how and why but this is THE algorithm to calculate ggd
   public static int ggd(int n, int m) {
      if (n % m == 0) {
         return m;
      }
      else {
         return ggd(m, n % m);
      }
   }

   public static int kgv(int n, int m) {
      return (n * m) / ggd(n, m); // :-)
   }

}
