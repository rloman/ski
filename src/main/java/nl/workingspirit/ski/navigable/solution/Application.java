package nl.workingspirit.ski.navigable.solution;


public class Application {

   
   public static void main(String[] args) {
      
      System.out.println(fac(3));
      
   }
   
   
   public static int fac(int n) {
      if(n == 0) {
         return 1;
      }
      else {
         return n * fac(n-1);
      }
   }
}
