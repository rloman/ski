package nl.example.app.recursion.priemontbinding;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import nl.example.app.recursion.priemontbinding.PriemOntbindingSimpler;

public class PriemOntbindingSimplerTest {

   private PriemOntbindingSimpler po;

   @Before
   public void setUp() {
      this.po = new PriemOntbindingSimpler();
   }

   @Test
   public void testSix() {
      Assert.assertEquals(Arrays.asList(2, 3), this.po.po(6));
   }

   @Test
   public void testNine() {
      Assert.assertEquals(Arrays.asList(3, 3), this.po.po(9));
   }

   @Test
   public void test19() {
      Assert.assertEquals(Arrays.asList(19), this.po.po(19));
   }

   @Test
   public void test21() {
      Assert.assertEquals(Arrays.asList(3, 7), this.po.po(21));
   }

   @Test
   public void test4() {
      Assert.assertEquals(Arrays.asList(2, 2), this.po.po(4));
   }

   @Test
   public void test2004() {
      Assert.assertEquals(Arrays.asList(2, 2, 3, 167), this.po.po(2004));
   }
   
   @Test
   public void test1970() {
      Assert.assertEquals(Arrays.asList(2, 5, 197), this.po.po(1970));
   }

   @Test
   public void test1024() {
      Assert.assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2), this.po.po(1024));
   }

   @Test
   public void test44() {
      Assert.assertEquals(Arrays.asList(2, 2, 11), this.po.po(44));
   }
   
   @Test
   public void test2005() {
      Assert.assertEquals(Arrays.asList(5, 401), this.po.po(2005));
   }

}
