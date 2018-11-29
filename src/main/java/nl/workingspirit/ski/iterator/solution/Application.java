package nl.workingspirit.ski.iterator.solution;


public class Application {
   
   public static void main(String[] args) {
      Fruit f = new Fruit("Apple");
      
      Fruitmand m = new Fruitmand();
      
      m.add(f);
      
      for(Fruit fruit: m) {
         System.out.println(fruit);
      }
   }

}
