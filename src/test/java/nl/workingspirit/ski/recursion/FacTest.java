package nl.workingspirit.ski.recursion;

import org.junit.Assert;
import org.junit.Test;


public class FacTest {
   
   @Test
   public void facTest() {
      Assert.assertEquals(6, Fac.fac(3));
      Assert.assertEquals(2, Fac.fac(2));
      Assert.assertEquals(120, Fac.fac(5));
   }

}
