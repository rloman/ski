package nl.workingspirit.ski.navigable.solution;

import java.util.Set;

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
      Assert.assertEquals("10:30", this.trainSchedule.getTimeBefore("10:32"));
   }
   
   @Test
   public void testLaterTrains() {
      Set<String> laterTrains = this.trainSchedule.laterTrains("12:00");
      
      Assert.assertTrue(laterTrains.contains("13:15"));
      Assert.assertTrue(laterTrains.contains("16:30"));
      
      Assert.assertEquals(2,  laterTrains.size());
   }

}
