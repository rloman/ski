package nl.example.app.designpatterns.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.walkBehaviour = new WalkWithFeet();
	}
}