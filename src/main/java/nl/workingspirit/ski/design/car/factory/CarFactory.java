package nl.workingspirit.ski.design.car.factory;

public abstract class CarFactory {
	
	private CarFactory(){
		
	}
	
	public static Car createBentley() {
		return new Bentley();
	}
	
	public static Car createVolvo() {
		
		return new Volvo(3);
		
	}

   public static Car createBMW() {
      return new BMW();
   }

}
