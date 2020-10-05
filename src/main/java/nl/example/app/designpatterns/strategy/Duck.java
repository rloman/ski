package nl.example.app.designpatterns.strategy;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    WalkBehaviour walkBehaviour;

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performWalk() {
        this.walkBehaviour.walk();
    }

    // if you want to change the behaviour during runtime of EVERY duck.
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setWalkBehaviour(WalkBehaviour walkBehaviour) {
        this.walkBehaviour = walkBehaviour;
    }
}
