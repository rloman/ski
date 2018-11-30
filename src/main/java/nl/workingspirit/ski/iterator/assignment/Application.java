package nl.workingspirit.ski.iterator.assignment;


public class Application {
   
   public static void main(String[] args) {
      Fruit f = new Fruit("Apple");
      
      Fruitmand m = new Fruitmand();
      
      m.add(f);
      m.add(new Fruit("Pear"));
      m.add(new Fruit("Banana"));
      
      /*
      for(Fruit fruit: m) {
         System.out.println(fruit);
      }
      */
   }

}
