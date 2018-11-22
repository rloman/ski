package nl.workingspirit.ski.navigable.solution;

import org.junit.Assert;
import org.junit.Test;


public class TrainScheduleTest {
   
   private TrainSchedule trainSchedule = new TrainSchedule();
   
   @Test
   public void testSomeAfter() {
      
      Assert.assertEquals("10:30", this.trainSchedule.getTimeAfter("09:45"));
      
   }
   
   @Test
   public void testSomeBefore() {
      Assert.assertEquals("13:15", this.trainSchedule.getTimeAfter("13:00"));
   }

}
