package inheritance;
class Vehical{
	String mode="Runs";
	public void doors() {
		System.out.println("Yes, it has doors.");
	}
	
}

public class Car extends Vehical {
	int noOfTyres=4;
	public void color() {
		System.out.println("It is of black color");
	}
	String brand;
	Car(String brand){
		this.brand=brand;
	}

	public static void main(String[] args) {
		// making Car object
		
		Car c = new Car("Mahindra");
		System.out.println("The vehical condition is to : "+c.mode);
		c.doors();
		System.out.println("No of tyres in the vehical is : "+c.noOfTyres);
		c.color();
		System.out.println("The car is of "+c.brand+" brand.");

	}

}
