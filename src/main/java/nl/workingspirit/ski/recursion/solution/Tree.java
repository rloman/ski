package nl.workingspirit.ski.recursion.solution;


public class Tree {
   
   private Integer value;
   
   private Tree left;
   private Tree right;
   
   public void add(int n) {
      if(this.value == null) {
         this.value = n;
         this.left = new Tree();
         this.right = new Tree();
      }
      else {
         if(n <= value){
            left.add(n);
         }
         else {
            right.add(n);
         }
      }
   }
   
   public void pp() {
      if(this.left != null) {
         left.pp();
      }
      System.out.print(value != null ? value :" ");
      if(this.right != null) {
         right.pp();
      }
   }

}
