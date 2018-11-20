package nl.workingspirit.ski.store.mockito.solution;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import nl.workingspirit.ski.model.Skies;
import nl.workingspirit.ski.service.SkiService;
import nl.workingspirit.ski.store.SkiStore;

@RunWith(MockitoJUnitRunner.class)
public class SkiStoreTest {
   
   @InjectMocks
   private SkiStore skiStore;
   
   @Mock
   private SkiService service;
   
   @Test
   public void testRent() {
      
      // Given (Arrange)
      Skies skies = new Skies();
      
      Mockito.when(this.service.rent(Mockito.any(Skies.class)))
      .thenReturn(3.5);
      
      
      // When (Act)
      double resultOfRent = this.skiStore.rent(skies);
      
      
      // Then (Assert)
      Mockito.verify(this.service).rent(Mockito.any(Skies.class));
      
      Assert.assertEquals(3.5, resultOfRent, 0.1);
   }
   
   
   @Test
   public void testCheckForDamage() {
      
      // Given (Arrange)
      Skies skies = new Skies();
      
      Mockito.when(this.service.checkForDamage(Mockito.any(Skies.class)))
      .thenReturn(false);
      
      
      // When (Act)
      boolean resultFromStore = this.skiStore.checkForDamage(skies);
      
      
      // Then (Assert)
      Mockito.verify(this.service).checkForDamage(Mockito.any(Skies.class));
      
      Assert.assertFalse(resultFromStore);
   }


}
