package nl.workingspirit.ski.store.mockito.assignment;

import org.junit.Assert;
import org.junit.Test;

import nl.workingspirit.ski.model.Skies;
import nl.workingspirit.ski.service.SkiService;
import nl.workingspirit.ski.store.SkiStore;

//@RunWith(???)
public class SkiStoreTest {
   
   // inject some here???
   private SkiStore skiStore;
   
  // mockit 
   private SkiService service;
   
//   @Test
   public void testRent() {
      
      // Given (Arrange)
      Skies skies = new Skies();
      
//      Mockito.when(??)))
//      .thenReturn(3.5);
      
      
      // When (Act)
      double resultOfRent = this.skiStore.rent(skies);
      
      
      // Then (Assert)
//      Mockito.???(this.service).rent(Mockito.any(Skies.class));
      
      Assert.assertEquals(3.5, resultOfRent, 0.1);
   }
}
