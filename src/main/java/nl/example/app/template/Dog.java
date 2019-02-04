package nl.example.app.template;


public class Dog extends Animal {

   // the trick of the Template pattern is here ... to force the new collegae to not forget to implement this method and to force him/her
   @Override
   public void makeSound() {
      
      System.out.println("Wooof!!! ...");
      
   }

}
