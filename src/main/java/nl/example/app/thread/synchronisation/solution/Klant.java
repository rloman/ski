package nl.example.app.thread.synchronisation.solution;


public class Klant extends Thread {
   
   private Voorraad voorraad = Voorraad.getInstance();
   
   @Override
   public void run() {
      for(int i = 0;i<10;i++) {
         try {
            voorraad.decrement();
         }
         catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
         try {
            Thread.sleep(5);
         }
         catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
   

}
