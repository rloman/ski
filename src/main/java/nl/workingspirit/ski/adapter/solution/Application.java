package nl.workingspirit.ski.adapter.solution;

import nl.workingspirit.ski.adapter.Duck;

public class Application {
   
   public static void main(String[] args) {
      Duck d = new PavoAdapter(new WildPavo());
      
      d.walk();
      d.quack();
   }

}
