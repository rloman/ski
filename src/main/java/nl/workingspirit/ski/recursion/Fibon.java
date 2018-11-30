package nl.workingspirit.ski.recursion;


public class Fibon {
   
   // note: this is a bad algorithms but shows the principle of recursion pretty wel!!!
   public static int fibon(int n) {
      if(n == 0 ) {
         return 0;
      }
      if(n == 1) {
         return 1;
      }
      else{
         return fibon(n-2) + fibon(n-1);
      }
   }

}
