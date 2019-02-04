package nl.example.app.thread.synchronisation.assignment;

// This class models the voorraad (supply)
public class Voorraad {

   private static Voorraad instance;

   public static synchronized Voorraad getInstance() {

      if (instance == null) {
         instance = new Voorraad();
      }

      return instance;

   }

   private int voorraad;

   private Voorraad() {

   }

   public synchronized void increment() {
      // Add your code here!
   }

   public synchronized void decrement() throws InterruptedException {
     // Add your code here!
   }

   public int getVoorraad() {
      return voorraad;
   }

}
