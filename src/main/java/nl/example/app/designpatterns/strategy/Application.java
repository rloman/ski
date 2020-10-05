package nl.example.app.designpatterns.strategy;

public class Application {

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		
		duck.performFly();
		duck.performWalk();
		
		duck = new SciFiDuck();
		duck.performFly();
		duck.performWalk();
	}

}
