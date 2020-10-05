package nl.example.app.designpatterns.strategy;

public class WalkOnWheels implements WalkBehaviour {

	@Override
	public void walk() {
		System.out.println("Landing on two wheels ...");
	}

}
