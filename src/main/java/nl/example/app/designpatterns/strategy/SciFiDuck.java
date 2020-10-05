package nl.example.app.designpatterns.strategy;

public class SciFiDuck extends Duck {
	
	public SciFiDuck() {
		this.flyBehaviour = new FlyWithRocket();
		this.walkBehaviour = new WalkOnWheels();
	}

}
