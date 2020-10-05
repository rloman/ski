package nl.example.app.designpatterns.strategy.solution;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public void performUseWeapon() {
        this.weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
