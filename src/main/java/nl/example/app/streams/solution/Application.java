package nl.example.app.streams.solution;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Application {

   public static void main(String[] args) {
      List<Integer> fibon = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);

      final String groupName = "Working rocks with Spirit!!!";

      // Supplier<String> stringSupplier = String::new;

      Supplier<String> stringStringer = groupName::toUpperCase;

      fibon.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .filter(n -> n > 500).forEach(System.out::println);

      // Nu wil ik hier weer een List of een Set van maken!!!
      fibon = fibon.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .filter(n -> n > 500)
                        .collect(Collectors.toList());
      
      Set <Integer> setje = fibon.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .filter(n -> n > 500)
                        .collect(Collectors.toSet());
      
      setje.forEach(System.out::println);
      
      System.out.println(fibon);

      // foo(stringStringer);
   }

   public static void foo(Supplier<String> stringSupplier) {

      String groupNameAgain = stringSupplier.get();
      System.out.println(groupNameAgain);

   }

}
