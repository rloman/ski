package nl.workingspirit.ski.recursion.solution;


public class Tree {
   
   // tell them that in the wil there is also an Object attachted to this value
   private Integer value;
   
   private Tree left;
   private Tree right;
   
   public int size() {
      if(this.value == null) {
         return 0;
      }
      else {
         return 1+left.size()+right.size();
      }
   }
   
   public boolean isLeaf() {
      return this.size() <= 1;
   }
   
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
   
   public int smallest() {
      if(left.value == null) {
         return this.value;
      }
      else {
         return left.smallest();
      }
   }
   
   public int largest() {
      if (right.value == null) {
         return this.value;
      }
      else {
         return right.largest();
      }
   }
   
   public void delete(int n) {
     // if(this.value == null) {
       //  return;
    //  }
      if(this.value.equals(n)) {
         if(isLeaf()) {
            this.value = null;
            this.left = null;
            this.right = null;
         }
         else {
            if(left.size() <= right.size()) {
               int rightSmalltest = right.smallest();
               right.delete(rightSmalltest);
               this.value = rightSmalltest;
            }
            else {
               int leftLargest = left.largest();
               left.delete(leftLargest);
               this.value = leftLargest;
            }
         }
      }
      else {
         if(n <= this.value){
            left.delete(n);
         }
         else {
            right.delete(n);
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
