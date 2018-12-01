package nl.workingspirit.ski.recursion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RecursiveListTest {
   
   private RecursiveList<String> recList;
   
   @Before
   public void setUp() {
      this.recList = new RecursiveList<>();
   }
   

   @Test
   public void testAdd(){

      recList.add("Raymond");
      recList.add("Annebert");
      recList.add("Lieke");
      recList.add("Wout");
      
      String result = recList.toString();
      assertEquals("RayAnnebertLiekeWout", result);

      assertEquals(4, recList.size());

      assertEquals("Lieke", recList.get(2));

      assertEquals("Wout", recList.get(3));

      assertTrue(recList.contains("Annebert"));
      
      recList.update("Annebert", "Annebert is lief");
      
      result = recList.toString();
      
      assertEquals("RayAnnebert is liefLiekeWout", result);
      
      recList.delete("Wout");
      
      result = recList.toString();
      
      assertEquals("RayAnnebert is liefLieke", result);
      
      assertEquals(3, recList.size());
   }

}
