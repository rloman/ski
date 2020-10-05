package nl.example.app.designpatterns.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehaviour = new FlyNoWayBehaviour();
        this.walkBehaviour = new WalkNoWayBehaviour();
    }
}
