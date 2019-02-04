package nl.example.app.binarysearch.solution;

import java.util.Arrays;
import java.util.List;

public class Application {
   
   public static void main(String[] args) {
      
      List<Integer> numbers = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89);
      
      int result = Arrays.binarySearch(numbers.toArray(new Integer[0]), 34);
      
      System.out.println(result);
      
      result = Arrays.binarySearch(numbers.toArray(new Integer[0]), 45);
      
      System.out.println(result);
      
   }

}
