package nl.workingspirit.ski.recursion;


public class Application {

   public static void main(String[] args) {
      
      RecursiveList<String> recList = new RecursiveList<>();
      
      recList.add("Ray");
      recList.add("Annebert");
      recList.add("Lieke");
      recList.add("Wout");
      
      System.out.println(recList);

   }

}
