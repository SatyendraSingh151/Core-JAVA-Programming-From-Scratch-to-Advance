package Encapsulation_Concept;

class Vehical{
//	private non static variables
	private String mode;
	private String fuel;
	
//	initializing the non static private variables
	
//	setter for the mode
	public void setMode(String mode) {
		this.mode=mode;
	}
//	getter for the mode
	public String getMode() {
		return mode;
	}
	
//	setter for fuel
	public void setFuel(String fuel){
		this.fuel=fuel;
	}
//	getter for the fuel
	public String getFuel() {
		return fuel;
	}
	
	
	
}

public class Audi extends Vehical{
//	non static variables
	String color;
	double price;
	
	
//	constructor for the initialization of the non static variable
	Audi(String color,double price){
		this.color=color;
		this.price=price;
	}
	
//	this is the non static method
	public void capacity() {
		System.out.println("This has the capacity to run for 10 days nonstop. ");
	}

	public static void main(String[] args) {
		
//		making the object reference
		Audi a = new Audi("Black",456789546);
		
		
//		accessing the private members of the parent class
		a.setFuel("Petrol");
		a.setMode("Running");
		System.out.println("The car is of "+a.getFuel()+" type.");
		System.out.println("The mode of the car is "+a.getMode());
		
		
//		now accessing the child class members
		System.out.println("The car is of "+a.color+" color.");
		System.out.println("The price of the car is "+a.price);
		a.capacity();
		

	}

}
