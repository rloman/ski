package nl.workingspirit.ski.tables;

import java.util.List;

public class Application {

   public static void main(String[] args) {

      TableTools t = new TableTools();
      t.setAvailableTables(1, 6, 8, 7);

      List<Integer> result = t.solve(10, false);
      System.out.println(result);

   }

}
