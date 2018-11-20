package nl.workingspirit.ski.store;

import nl.workingspirit.ski.model.Skies;
import nl.workingspirit.ski.service.SkiService;

public class SkiStore {

   private SkiService skiService;

   public double rent(Skies skies) {
      return this.skiService.rent(skies);
   }

   public boolean checkForDamage(Skies skies) {
      return this.skiService.checkForDamage(skies);
   }
}
