package nl.example.app.recursion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import nl.example.app.recursion.RecursiveList;

public class RecursiveListTest {
   
   private RecursiveList<String> recList;
   
   @Before
   public void setUp() {
      this.recList = new RecursiveList<>();
   }
   

   @Test
   public void testAdd(){

      recList.add("Ray");
      recList.add("NAC");
      recList.add("Heracles");
      recList.add("Eagles");
      
      String result = recList.toString();
      assertEquals("RayNACHeraclesEagles", result);

      assertEquals(4, recList.size());

      assertEquals("Heracles", recList.get(2));

      assertEquals("Eagles", recList.get(3));

      assertTrue(recList.contains("NAC"));
      
      recList.update("NAC", "NAC is de mooiste club");
      
      result = recList.toString();
      
      assertEquals("RayNAC is de mooiste clubHeraclesEagles", result);
      
      recList.delete("Eagles");
      
      result = recList.toString();
      
      assertEquals("RayNAC is de mooiste clubHeracles", result);
      
      assertEquals(3, recList.size());
   }

}
