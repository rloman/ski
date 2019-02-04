package nl.example.app.iterator.reclist;

import java.util.Iterator;

public class RecList<T> implements Iterable<T> {

   private T head;
   private RecList<T> tail;

   public void add(T t) {
      if (this.head == null) {
         this.head = t;
         this.tail = new RecList<>();
      }
      else {
         tail.add(t);
      }
   }

   @Override
   public Iterator<T> iterator() {

      return new RecListIterator (this);
   }

   private class RecListIterator implements Iterator<T> {

      private RecList<T> recList;

      public RecListIterator(RecList<T> list) {
         this.recList = list;
      }

      @Override
      public boolean hasNext() {
         return this.recList.tail != null;
      }

      @Override
      public T next() {
         T result = recList.head;
         this.recList = this.recList.tail;

         return result;
      }

   }
}
