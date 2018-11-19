package nl.workingspirit.ski.streams.solution;

import java.util.Arrays;
import java.util.List;

public class Application {

   public static void main(String[] args) {
      List<Integer> fibon = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
      
      final String groupName  = "Working Spirits with Spirit!!!";

      fibon.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .map(Integer::intValue)
                        .map(n -> {
                          return groupName.charAt(n) ;
                        });
                       /* .filter(n -> n > 500)
                        .forEach(System.out::println);
                        */
   }

}
