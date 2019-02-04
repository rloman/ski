package nl.example.app.recursion;

import org.junit.Assert;
import org.junit.Test;

import nl.example.app.recursion.Fac;


public class FacTest {
   
   @Test
   public void facTest() {
      Assert.assertEquals(6, Fac.fac(3));
      Assert.assertEquals(2, Fac.fac(2));
      Assert.assertEquals(120, Fac.fac(5));
   }

}
