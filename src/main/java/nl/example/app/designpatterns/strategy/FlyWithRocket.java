package nl.example.app.designpatterns.strategy;

public class FlyWithRocket implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flying like a space shuttle ... with rockets ...");
	}
}
