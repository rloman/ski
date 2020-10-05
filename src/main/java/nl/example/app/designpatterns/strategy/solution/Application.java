package nl.example.app.designpatterns.strategy.solution;

public class Application {

    public static void main(String[] args) {

        System.out.println("== Knight");
        Character k = new Knight();
        k.performUseWeapon();

        System.out.println("\n== King");
        k = new King();
        k.performUseWeapon();

        System.out.println("\n== King can also use Sword ... ");
        k = new Knight();
        k.setWeaponBehaviour(new SwordBehaviour());
        k.performUseWeapon();
    }
}