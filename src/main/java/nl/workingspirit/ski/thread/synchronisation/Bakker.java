package nl.workingspirit.ski.thread.synchronisation;


public class Bakker extends Thread {
   
   private Voorraad voorraad = Voorraad.getInstance();

   
   public void bak() {
      voorraad.increment();
   }
   
   @Override
   public void run() {
      for(int i = 0;i<30;i++) {
         bak();
         try {
            Thread.sleep(5);
         }
         catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
}
