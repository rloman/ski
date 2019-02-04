package nl.example.app.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void walk() {
		System.out.println("Walking turkey ...");

	}

	@Override
	public void gobble() {
		System.out.println("Gobble ... gobble ...");
	}

}
