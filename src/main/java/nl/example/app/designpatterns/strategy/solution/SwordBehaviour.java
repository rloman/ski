package nl.example.app.designpatterns.strategy.solution;

public class SwordBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Character is using Sword ... ");
    }
}
