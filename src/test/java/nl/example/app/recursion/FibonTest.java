package nl.example.app.recursion;

import org.junit.Assert;
import org.junit.Test;

import nl.example.app.recursion.Fibon;

public class FibonTest {
   
   @Test
   public void fibonTest() {
      Assert.assertEquals(5,  Fibon.fibon(5));
      Assert.assertEquals(55, Fibon.fibon(10));
      Assert.assertEquals(34+55, Fibon.fibon(11));
      Assert.assertEquals(55+89, Fibon.fibon(12));
   }

}
