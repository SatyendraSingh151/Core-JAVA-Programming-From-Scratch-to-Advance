package polymorphism_Method_Overloading_And_Method_Overriding;


class Parent{
	
	
	String  color;
	double price;
	void home() {
		System.out.println("House is of red color.");
	}
	void home(String color) {
		this.color=color;
		System.out.println("Now the home color is : "+color);
	}
	void home(String color , double price) {
		this.color=color;
		this.price=price;
		System.out.println("Now the home color is : "+color);
		System.out.println("Budget is : "+price);
	}
	
	void business() {
		System.out.println("Started the shop.");
	}
	
}

public class Child extends Parent {
	
//	method overriding ( run time )
	
	@Override
	void business() {
		System.out.println("\nNow the business is expanded and opened the showroom.");
	}

	public static void main(String[] args) {
//		method overloading ( compile time )
		
		Child c = new Child();
		
		c.home();
		c.home("Orange");
		c.home("Green", 1245422544);
		
		
		c.business();
		
		

		
		
		

	}

}
