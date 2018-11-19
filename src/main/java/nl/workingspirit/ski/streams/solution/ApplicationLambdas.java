package nl.workingspirit.ski.streams.solution;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApplicationLambdas {

   public static void main(String[] args) {

      Person kevin = new Person("Kevin");
      Person annemarije = new Person("Annemarije");

      List<Person> people = Arrays.asList(kevin, annemarije);

      Set<Person> peopleWithAnAInName = people
                        .stream()
                        .filter(p -> p.getName().contains("A") || p.getName().contains("a"))
                        .map(p -> {
                           String name = p.getName();
                           name = new StringBuilder(name).reverse().toString();
                           p.setName(name);

                           return p;
                        }).collect(Collectors.toSet());

      System.out.println(peopleWithAnAInName);

   }

}
