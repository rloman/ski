package nl.workingspirit.ski.thread;

public class Application {

   public static void main(String[] args) {

         Thread t1 = new CounterThread(1);
         Thread t2 = new CounterThread(2);
         Thread t3 = new CounterThread(3);
         
         t1.start();
         t2.start();
         t3.start();
   }

}
