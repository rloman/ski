package nl.example.app.recursion.radix;

public class Application {
   
   public static void main(String[] args) {
      
      Radixer r = new Radixer();
      System.out.println(r.radixBinair(173));
      
      System.out.println(r.radixHex(10255));
   }

}
