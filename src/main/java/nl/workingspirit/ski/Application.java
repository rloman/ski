package nl.workingspirit.ski;

import java.util.Scanner;

public class Application {

   public static void main(String[] args) {
      
      try ( Scanner s = new Scanner(System.in)) {
         String line = s.nextLine();
         
         System.out.println(line);
      }
      
   }
}
