package nl.workingspirit.ski.iterator;

import java.util.Iterator;

public class SquareIterator implements Iterable <Integer>, Iterator<Integer> {
   
   private int current;
   
   private int min;
   private int max;
   
   
   public SquareIterator(int min, int max) {
      this.min = min;
      this.max = max;
      this.current = min;
   }

   @Override
   public boolean hasNext() {
      
      return current < max ? true : false;
   }

   @Override
   public Integer next() {
     return current * current++;
   }

   @Override
   public Iterator<Integer> iterator() {
      return this;
   }
}
