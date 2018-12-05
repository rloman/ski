package nl.workingspirit.ski.designpatterns.iterator;


public class Card {
   
   private String name;

   public Card(String name) {
      this.name = name;
   }

   
   public String getName() {
      return name;
   }


   @Override
   public String toString() {
      return "Card [name=" + name + "]";
   }
}
