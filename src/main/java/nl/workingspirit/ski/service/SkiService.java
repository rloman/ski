package nl.workingspirit.ski.service;

import nl.workingspirit.ski.model.Skies;

public interface SkiService {
   
   double rent(Skies skies);
   boolean checkForDamage(Skies skies);
}
