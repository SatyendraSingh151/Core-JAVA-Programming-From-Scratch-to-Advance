package constructor_Topics;

public class Car2 {

	String name;
	double price;
	int tyres;
	String color;
	String status;
	
//	making the constructor overloading concept here in the non static variables
	public Car2(String name) {
		this.name=name;
	}
	
	Car2(String name, double price){
		this(name);
		this.price=price;
		
	}
	Car2(String name, double price, int tyres){
		this(name, price);
		this.tyres=tyres;
		
	}
	
	Car2(String name, double price, int tyres, String color){
		this(name, price, tyres);
		this.color=color;
		
	}
	Car2(String name, double price, int tyres, String color, String status){
		this(name, price, tyres, color);
		this.status=status;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
//		making the object reference for the class Car2
		Car2 car1 = new Car2("Scorpio", 1500000,5,"Black","Start");
		System.out.println("This car is "+car1.name+", Price is "+car1.price+", it has no of tyres in it "+car1.tyres+", the color is "+car1.color+" and the car is in "+car1.status+" mode.");

	}

}
