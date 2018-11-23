package nl.workingspirit.ski.navigable.solution;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TrainSchedule {
   
   private NavigableSet<String> schedule = new TreeSet<>();
   
   public TrainSchedule() {
      // add some times
      this.schedule.addAll(Arrays.asList("10:30", "09:30", "13:15", "16:30"));
   }
   
   public String getTimeBefore(String time) {
      return this.schedule.lower(time);
   }
   
   public String getTimeAfter(String time) {
      return this.schedule.higher(time);
   }
   
   // bonus :-)
   public Set<String> laterTrains(String time) {
      return this.schedule.tailSet(time,  false);
   }
   
   
   

}
