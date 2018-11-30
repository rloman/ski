package nl.workingspirit.ski.recursion;


public class RecursiveList <T> {
   
   private T head;
   private RecursiveList<T> tail;
   
   public void add(T t) {
      if(this.head == null) {
         this.head = t;
         this.tail = new RecursiveList<>();
      }
      else {
         this.tail.add(t);
      }
   }
   
   @Override
   public String toString() {
      String result = "";
      if(this.head == null) {
         return result;
      }
      else {
         return result+head+tail;
      }
   }

}
