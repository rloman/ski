package nl.example.app.thread.runnable;

public class Application {

   public static void main(String[] args) {
      // Start B as thread :-)
      new Thread(new B()).start();
   }

}

class A {

}

class B extends A implements Runnable {

   public void run() {
      for (int i = 0; i < 3; i++) {
         System.out.println(i);
      }
   }

}
