package nl.workingspirit.ski.iterator.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruitmand implements Iterable<Fruit> {
   
   private List<Fruit> content = new ArrayList<>();
   
   public void add(Fruit f) {
      this.content.add(f);
   }

   @Override
   public Iterator<Fruit> iterator() {
      
      return this.content.iterator();
   }
   
   

}
