package nl.workingspirit.ski.thread.synchronisation.assignment;


// This bakker will bake 30 breads in one run method which increments the voorraad
public class Bakker extends Thread {
   
   private Voorraad voorraad = Voorraad.getInstance();

   
   public void bak() {
      voorraad.increment();
   }
   
   @Override
   public void run() {
      
      // Add your code here!
   }
   
}
