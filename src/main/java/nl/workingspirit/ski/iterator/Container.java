package nl.workingspirit.ski.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<String> {
   
   private List<String> content = new ArrayList<>();
   
   public void add(String name) {
      this.content.add(name);
   }

   @Override
   public Iterator<String> iterator() {
      
      return this.content.iterator();
   }

}
