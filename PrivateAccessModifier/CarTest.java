package PrivateAccessModifier;

public class CarTest {

	public static void main(String[] args) {
//		accessing by class referance
		 
		Car.car();
		
		// accessing in the other class
		
		Car c = new Car();
		c.car();

//		this both method will give error
	}

}
