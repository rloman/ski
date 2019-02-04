package nl.example.app.store;

import nl.example.app.model.Skies;
import nl.example.app.service.SkiService;

public class SkiStore {

   private SkiService skiService;

   public double rent(Skies skies) {
      
      return this.skiService.rent(skies);
   }

   public boolean checkForDamage(Skies skies) {
      return this.skiService.checkForDamage(skies);
   }
}
