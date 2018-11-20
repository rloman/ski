package nl.workingspirit.ski.store;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import nl.workingspirit.ski.model.Skies;

public class SkiStoreTest {
   
   private SkiStore skiStore;
   
   @Before
   public void setUp() {
      this.skiStore = new SkiStore();
   }
   
   @Test
   public void testRent() {
      Skies s = new Skies();
      double resultOfRent = this.skiStore.rent(s);
      
      Assert.assertNotEquals(0, resultOfRent);
   }

}
