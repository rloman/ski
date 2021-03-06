package nl.example.app.design.car;

import nl.example.app.design.car.factory.BMW;
import nl.example.app.design.car.factory.Car;
import nl.example.app.design.car.factory.CarFactory;

public class Main {

	public static void main(String[] args) {
		
		Car c = CarFactory.createVolvo();
		Car d = CarFactory.createBMW();
		Car e = CarFactory.createBentley();
		

		c.drive();
		d.drive();
		e.drive();
		
		// unable to create a Car implementor since they all have a package access constructor
//		Car b = new BMW(); // FAILS since constructor is not visible! That is the most forgotten thing in the factory pattern!
		
	}

}
