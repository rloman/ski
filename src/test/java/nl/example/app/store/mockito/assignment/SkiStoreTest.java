package nl.example.app.store.mockito.assignment;

import org.junit.Assert;
import org.junit.Test;

import nl.example.app.model.Skies;
import nl.example.app.service.SkiService;
import nl.example.app.store.SkiStore;

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
