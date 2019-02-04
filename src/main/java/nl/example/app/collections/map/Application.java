package nl.example.app.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Application {

   public static void main(String[] args) {
      
      Map<Integer, Jas> garderobe = new HashMap<>();
      
      Jas jazreiza = new Jas("Jazreiza");
      
      garderobe.put(12,  jazreiza);
      Jas kevin = new Jas("Kevin");
      
      garderobe.put(24, kevin);
      
      Jas jorim = new Jas("Jorim");
      garderobe.put(133, jorim);
      
      print(garderobe);
      
      Map<Character, Jas> korteGarderobe = new HashMap<>();
      korteGarderobe.put('J', jorim);
      

   }
   
   public static void print(Map<Integer, Jas> garderobe) {
      
      Jas kevinZijnJas = garderobe.get(24);
      System.out.println(kevinZijnJas);
      
      System.out.println(garderobe.get(133));
      
      System.out.println(garderobe.get(12));
      
      // unknown key
      System.out.println(garderobe.get(42));
      
   }

}

class Jas {

   private String name;

   public Jas(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Jas [name=" + name + "]";
   }

}
