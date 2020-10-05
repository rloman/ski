package nl.example.app.designpatterns.strategy.solution;

public class Knight extends Character {


    public Knight() {

        this.weaponBehaviour = new SwordBehaviour();

    }
}
