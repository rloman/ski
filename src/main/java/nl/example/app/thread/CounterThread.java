package nl.example.app.thread;


public class CounterThread extends Thread {
   
   private int id;
   
   public CounterThread(int id) {
      this.id = id;
   }
   
   @Override
   public void run() {
      for(int i = 1;i<11;i++) {
         System.out.println("Running Counterthread with id:"+id+": "+i);
         try {
            Thread.sleep(10);
         }
         catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      
   }
   
   

}
