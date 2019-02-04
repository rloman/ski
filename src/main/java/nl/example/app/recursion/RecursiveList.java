package nl.example.app.recursion;

public class RecursiveList<T> {

   private T head;
   private RecursiveList<T> tail;

   public void add(T t) {
      if (this.head == null) {
         this.head = t;
         this.tail = new RecursiveList<>();
      }
      else {
         this.tail.add(t);
      }
   }

   public T get(int index) {
      if (index == 0) {
         return head;
      }
      else {
         return tail.get(--index);
      }
   }

   public boolean contains(T t) {
      if (this.head == null) {
         return false;
      }
      else {
         if (this.head.equals(t)) {
            return true;
         }
         else {
            return tail.contains(t);
         }
      }

   }

   public void update(T victim, T target) {
      if (this.head == null) {
         return;
      }
      else {
         if (this.head.equals(victim)) {
            this.head = target;
         }
         else {
            tail.update(victim, target);
         }
      }
   }

   // hardest
   public void delete(T victim) {
      if (this.head == null) {
         return;
      }
      else {
         if (this.head.equals(victim)) {
            this.head = tail.head;
            this.tail = tail.tail;
         }
         else {
            tail.delete(victim);
         }
      }
   }

   public int size() {
      if (this.head == null) {
         return 0;
      }
      else {
         return 1 + tail.size();
      }
   }

   @Override
   public String toString() {
      if (this.head == null) {
         return "";
      }
      else {
         return "" + head + tail;
      }
   }

}
