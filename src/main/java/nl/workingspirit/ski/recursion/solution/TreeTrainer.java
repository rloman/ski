package nl.workingspirit.ski.recursion.solution;


public class TreeTrainer {

   public static void main(String[] args) {
      
      Tree tree = new Tree();
      
      
      tree.add(5);
      tree.add(3);
      
      tree.add(13);
      
      
      tree.pp();
      System.out.println();
      
      System.out.println(tree.smallest());
      System.out.println(tree.largest());
      
      System.out.println(tree.size());
      
      tree.delete(3);
      
      tree.pp();
      

   }

}
