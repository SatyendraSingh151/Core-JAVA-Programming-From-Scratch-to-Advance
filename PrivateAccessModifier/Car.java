package PrivateAccessModifier;


public class Car {
// declaring the private static method
	
	private static void car() {
		System.out.println("The engine material is of silver and brass mixture.");
		
	}
	public static void main(String[] args) {
		// accessing the private static method directly
		
		car();
		

		// accessing the private static method class name as ref
		
		Car.car();
		
		// accessing the private static method by obj creation
		
		Car c =new Car();
		c.car();
		
	

	}

}
