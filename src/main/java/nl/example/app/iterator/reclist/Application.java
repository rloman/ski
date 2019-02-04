package nl.example.app.iterator.reclist;

public class Application {

   public static void main(String[] args) {
      
      RecList<String> names = new RecList<>();
      
      names.add("A");
      names.add("B");
      names.add("C");
      
      for(String name: names) {
         System.out.println(name);
      }
      
      for(String name: names) {
         
         System.out.println(name);
      }
      
   }

}
