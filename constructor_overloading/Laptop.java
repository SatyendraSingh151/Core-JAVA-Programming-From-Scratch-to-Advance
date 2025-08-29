package constructor_overloading;

public class Laptop {

	Laptop() {
		System.out.println("Congratulations! you got the offer to buy."); 
		
		
	}
	Laptop(double amount) {
		System.out.println("Yes there is the Laptop available in the budget of rs :"+amount); 
		
		
	}
	Laptop(double amount,String color) {
		System.out.println("Yes there is the Laptop available in the budget of rs :"+amount+" as well as your choice of the color is also available of "+ color); 
		
		
	}

	public static void main(String[] args) {
		// This is the main method
		
		new Laptop();
		new Laptop(65000);
		new Laptop(80000,"black");

	}

}
