package nl.example.app.singleton;


public class Application {

   public static void main(String[] args) {
      
      Singleton s = Singleton.getInstance();
      
      Singleton s2 = Singleton.getInstance();
      
      if(s != s2) {
         // should never, ever come here!
         System.out.println(0/0);
      }
      System.out.println("Successful completion");

   }

}
