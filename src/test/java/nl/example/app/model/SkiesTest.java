package nl.example.app.model;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

import nl.example.app.model.Skies;

public class SkiesTest {
   
   private Skies skies = new Skies();
   
   // let op:
   // na elke @Test methode wordt DE CONSTRUCTOR VAN DEZE CLASS DUS UITGEVOERD!!!
   
   @Test
   public void testSetBrand() {
      
      final String brand = "Atomic";
      
      skies.setBrand(brand);
      
      Assert.assertEquals(brand, skies.getBrand());
   }
   
   @Test
   public void testSetGetColor() {
      Color blue = Color.BLUE;
      
      skies.setColor(blue);
      
      Assert.assertEquals(Color.BLUE, skies.getColor());
   }
   
   @Test
   public void testSetLenghtWithZeroShouldThrowIllegalArgumentException() {
      try {
         skies.setLength(0);
         Assert.fail("Should never come here!!!");
      }
      catch(IllegalArgumentException iae) {
         // OK
      }
      
   }
}
