package nl.example.app.queue.solution;

import java.util.ArrayDeque;
import java.util.Collection;

public class Scheduler {

   private ArrayDeque<Task> taskQueue = new ArrayDeque<>();

   public void add(Task t) {
      
      if("Willem-Alexander".equals(t.getPersonName())) {
         this.taskQueue.push(t);
      }
      else {
         this.taskQueue.add(t);
      }
      
   }
   
   public void add(Collection<Task>tasks) {
      tasks.forEach(this::add);
   }
   
   public void execute() {
      while(!taskQueue.isEmpty()) {
         Task victim = taskQueue.poll();
         victim.execute();
      }
   }

}
