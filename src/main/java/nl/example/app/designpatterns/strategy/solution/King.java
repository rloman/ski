package nl.example.app.designpatterns.strategy.solution;

public class King extends  Character {

    public King() {
        this.weaponBehaviour = new BowAndArrowBehaviour();
    }
}
