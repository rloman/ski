package nl.example.app.designpatterns.strategy.solution;

public class BowAndArrowBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {

        System.out.println("Character is using Bow and Arrow ... ");

    }
}
