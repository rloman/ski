package nl.example.app.thread.synchronisation.assignment;

// this klant will buy 10 breads (so start 3 Klants which decrement the voorraad)
public class Klant extends Thread {
   
   private Voorraad voorraad = Voorraad.getInstance();
   
   @Override
   public void run() {
      // Add your code here!
   }
}
