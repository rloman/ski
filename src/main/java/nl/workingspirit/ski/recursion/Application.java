package nl.workingspirit.ski.recursion;

public class Application {

   public static void main(String[] args) {

      RecursiveList<String> recList = new RecursiveList<>();

      recList.add("Ray");
      recList.add("Annebert");
      recList.add("Lieke");
      recList.add("Wout");

      System.out.println(recList);

      System.out.println(recList.size());

      System.out.println(recList.get(2));

      System.out.println(recList.get(3));

      System.out.println(recList.contains("Annebert"));
      
      recList.update("Annebert", "Annebert is lief");
      
      System.out.println(recList);
      
      recList.delete("Wout");

      System.out.println(recList);
      
      System.out.println(recList.size());
   }

}
