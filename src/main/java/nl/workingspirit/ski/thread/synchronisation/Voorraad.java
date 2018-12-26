package nl.workingspirit.ski.thread.synchronisation;

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
      System.out.println("Ik ben nu in increment ...  value is: " + this.voorraad);
      voorraad++;
      notifyAll();
   }

   public synchronized void decrement() throws InterruptedException {
      System.out.println("Ik ben nu in decrement ...  value is: " + this.voorraad);
      while(voorraad == 0) {
         wait();
      }
      voorraad--;
   }

   public int getVoorraad() {
      return voorraad;
   }

}
