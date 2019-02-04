package nl.example.app.adapter.solution;

import nl.example.app.adapter.Duck;

public class Application {
   
   public static void main(String[] args) {
      Duck d = new PavoAdapter(new WildPavo());
      
      d.walk();
      d.quack();
   }

}
