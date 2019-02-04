package nl.example.app.queue.assignment;

import java.util.Collection;

public class Scheduler {

   
   //???
   
   public void add(Task t) {
      
      if("Willem-Alexander".equals(t.getPersonName())) {
      }
      else {
      }
      
   }
   
   public void add(Collection<Task>tasks) {
      tasks.forEach(this::add);
   }
   
   public void execute() {
//      while(!taskQueue.isEmpty()) {
//      ????
//         victim.execute();
//      }
   }

}
