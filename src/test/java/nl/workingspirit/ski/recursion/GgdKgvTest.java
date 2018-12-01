package nl.workingspirit.ski.recursion;

import org.junit.Assert;
import org.junit.Test;


public class GgdKgvTest {
   
   @Test
   public void testGgd() {
      Assert.assertEquals(6,  GgdKgv.ggd(18, 12));
      Assert.assertEquals(9,  GgdKgv.ggd(27, 18));
      Assert.assertEquals(1,  GgdKgv.ggd(27, 11));
   }
   
   @Test
   public void testKgv() {
      Assert.assertEquals(30,  GgdKgv.kgv(10,  30));
      Assert.assertEquals(105,  GgdKgv.kgv(5,  21));
      
      Assert.assertEquals(300,  GgdKgv.kgv(100,  30));
   }

}
