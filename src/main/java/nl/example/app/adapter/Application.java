package nl.example.app.adapter;

public class Application {

   public static void main(String[] args) {
      
      Turkey t = new WildTurkey();
      
      Duck duck = new TurkeyAdapter(t);
      
      duck.quack();
      
      duck = new BirdAdapter(new Finch());
      
      duck.quack();
      duck.walk();

   }
}

class BirdAdapter implements Duck {
   private Bird bird;
   
   public BirdAdapter(Bird bird) {
      this.bird =bird;
   }

   @Override
   public void quack() {
    this.bird.fluut();
      
   }

   @Override
   public void walk() {
      this.bird.fly();
   }
}

interface Bird {
   void fluut();
   void fly();
}

class Finch implements Bird {

   @Override
   public void fluut() {
      
      System.out.println("Fluut ...");
      
   }

   @Override
   public void fly() {
      System.out.println("Wapper wapper ... ");
      
   }
   
   

   
}
