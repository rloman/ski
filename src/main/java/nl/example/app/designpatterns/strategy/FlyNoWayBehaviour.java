package nl.example.app.designpatterns.strategy;

public class FlyNoWayBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
