package nl.example.app.designpatterns.strategy;

public class WalkNoWayBehaviour implements WalkBehaviour {

    @Override
    public void walk() {
        System.out.println("Walk no way");
    }
}
