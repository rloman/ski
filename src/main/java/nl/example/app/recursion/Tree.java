package nl.example.app.recursion;

public class Tree {

   private Integer value;
   private Tree left;
   private Tree right;

   public void put(int value) {

      if (this.value == null) {
         this.value = value;
      }
      else {
         if (value < this.value) {
            this.left = new Tree();
            left.put(value);
         }
         else {
            this.right = new Tree();
            right.put(value);
         }
      }
   }

   public void pp() {
      if (left != null) {
         left.pp();
      }
      System.out.println(this.value);

      if (right != null) {
         right.pp();
      }
   }

}

