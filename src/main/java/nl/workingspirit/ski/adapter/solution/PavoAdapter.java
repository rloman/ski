package nl.workingspirit.ski.adapter.solution;

import nl.workingspirit.ski.adapter.Duck;

public class PavoAdapter implements Duck {
   
   private Pavo pavo;
   
   public PavoAdapter(Pavo pavo) {
      this.pavo = pavo;
   }

   @Override
   public void quack() {
      
      this.pavo.sound();
      
   }

   @Override
   public void walk() {
      this.pavo.run();
      
   }

}
