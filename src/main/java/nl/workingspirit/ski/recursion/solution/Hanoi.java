package nl.workingspirit.ski.recursion.solution;


public class Hanoi {
   
   public static void hanoi(int aantal) {
      System.out.printf("Starting hanoi puzzle with '%d' disk%s%n", aantal, aantal > 1 ? "s": "");
      hanoi(aantal, 1,2,3);
      System.out.println("Done");
   }
   
   private static void hanoi(int aantal, int van, int via, int naar) {
      if(aantal == 0) {
         return;
      }
      else {
         hanoi(aantal-1, van, naar, via);
         System.out.printf("Move %d naar %d%n", van, naar);
         hanoi(aantal-1, via, van, naar);
      }
   }

}
