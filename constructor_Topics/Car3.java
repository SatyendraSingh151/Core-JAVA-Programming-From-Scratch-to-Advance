package constructor_Topics;

public class Car3 {
	String color;
	String vehical;
	double price;
	
	
//making the constructor overloading 
	public Car3() {
		
		System.out.println("This is the constructor without and formal arguments, here no initialization of the non static variable is done.");
		
	}
	
	public Car3(String color) {
		
		System.out.println("This is the constructor with 1 formal arguments.");
		this.color=color;
		
	}
	public Car3(String color, String vehical) {
		
		System.out.println("This is the constructor with 2 formal arguments.");
		this.vehical=vehical;
		
	}
	public Car3(String color, String vehical,double price) {
		
		System.out.println("This is the constructor with 3 formal arguments.");
		this.price=price;
		
	}

	public static void main(String[] args) {
//	we will make the object reference of the class to access the non static variables
		
		Car3 c1 = new Car3();
		System.out.println();
		
		Car3 c2 = new Car3("White");
		System.out.println("The color of the car is "+c2.color);
		System.out.println();
		
		Car3 c3 = new Car3("Black", "KIA");
		System.out.println("The color of the car is "+c3.color+" and the vehical is "+c3.vehical);
		System.out.println();
		
		Car3 c4 = new Car3("Red","Nexon",125425);
		System.out.println("The color of the car is "+c4.color+", the vehical is "+c4.vehical+" and the price is "+c4.price);
		

	}

}
