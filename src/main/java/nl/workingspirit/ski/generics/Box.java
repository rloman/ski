package nl.workingspirit.ski.generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
   
   private List<T> content = new ArrayList<T>();
   
   
   public void add(T t) {
      this.content.add(t);
   }
   
}
