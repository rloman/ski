package nl.workingspirit.ski.generics;

import java.util.ArrayList;
import java.util.List;

public class Application {

   public static void main(String[] args) {

      List<Integer> lijst = new ArrayList<>();

      Box<String> stringBox = new Box<>();

      stringBox.add("Luuk");
      stringBox.add("Anne-Marije");

      Box<Presentation> presentationBox = new Box<>();

      Presentation presentationFromNick = new Presentation();
      presentationBox.add(presentationFromNick);
      
      
//      presentationBox.add("Jansen");

   }

}
