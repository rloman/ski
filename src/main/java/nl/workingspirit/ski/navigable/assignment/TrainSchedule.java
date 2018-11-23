package nl.workingspirit.ski.navigable.assignment;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TrainSchedule {

   private NavigableSet<String> schedule; // add a concrete class

   public TrainSchedule() {
      // add some times
      this.schedule.addAll(Arrays.asList("10:30", "09:30", "13:15", "16:30"));
   }

   public String getTimeBefore(String time) {
      return "Something";

   }

   public String getTimeAfter(String time) {
      return "also something";
   }

}
