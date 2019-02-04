package nl.example.app.thread.synchronisation.solution;


public class Application {

   public static void main(String[] args) throws InterruptedException {
      
      Bakker b = new Bakker();
      
      Klant k1 = new Klant();
      Klant k2 = new Klant();
      Klant k3 = new Klant();
      
      b.start();
      
      k1.start();
      k2.start();
      k3.start();
      
      Thread.sleep(5000);
      
	// TODO 
      // Thread.join
      // runnable
      // atomic int
      
      System.out.println(Voorraad.getInstance().getVoorraad());

   }

}
