package nl.example.app.adapter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("<real duck>");
		Duck duck = new MallardDuck();
		testDuck(duck);
		System.out.println("</real duck>");
		
		System.out.println("<turkey adapter>");
		duck = new TurkeyAdapter(new WildTurkey());
		testDuck(duck);
		System.out.println("</turkey adapter>");

	} 
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.walk();
	}

}
