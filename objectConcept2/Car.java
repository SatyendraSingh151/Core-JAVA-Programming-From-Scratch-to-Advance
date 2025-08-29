package objectConcept2;

public class Car {
	String brand;
	String color;

	public static void main(String[] args) {
		// object creation
		Car c1 = new Car();
		c1.brand = "Maruti";
		c1.color="Red";
		System.out.println("This is the  "+c1.brand+" brand car, with "+c1.color+" color.");

	}

}
