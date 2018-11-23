package nl.workingspirit.ski.queue.solution;

import java.util.Arrays;

public class Application {
   
   public static void main(String[] args) {
      
      
      Scheduler s = new Scheduler();
      
      Task ray = new Task("Ray");
      Task w = new Task("Willem-Alexander");
      Task b = new Task("Anne");
      
      s.add(Arrays.asList(ray, w, b));
      
      s.execute();
      
   }

}
