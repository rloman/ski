package nl.example.app.service;

import nl.example.app.model.Skies;

public interface SkiService {
   
   double rent(Skies skies);
   boolean checkForDamage(Skies skies);
}
