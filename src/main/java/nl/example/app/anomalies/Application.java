package nl.example.app.anomalies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
   
   public static void main(String[] args) {
      int[] numbers = {1,2,3};
      
//      List<Integer> integerList =  Arrays.asList(numbers); // compiler error since numbers is int[] and boxing fails
      
      List<Integer> numberList = Arrays.asList(0,1,1,2,3);
      
      Integer[] array = numberList.toArray(new Integer[0]);
      
      
      for(int element: array) {
         System.out.println(element);
      }
      
      
   }
   

}
