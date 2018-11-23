package nl.workingspirit.ski.queue.solution;

import java.util.ArrayDeque;
import java.util.Collection;

public class Scheduler {

   private ArrayDeque<Task> taskList = new ArrayDeque<>();

   public void add(Task t) {
      
      if("Willem-Alexander".equals(t.getPersonName())) {
         this.taskList.push(t);
      }
      else {
         this.taskList.add(t);
      }
      
   }
   
   public void add(Collection<Task>tasks) {
      tasks.forEach(this::add);
   }
   
   public void execute() {
      while(!taskList.isEmpty()) {
         Task victim = taskList.poll();
         victim.execute();
      }
   }

}
