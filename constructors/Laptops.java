package constructors;

public class Laptops {
	String company;
	double price;
	String color;
	

	Laptops(String company,double price,String color) {
		this.company=company;
		this.price=price;
		this.color=color;
	}
	
	public void details() {
		System.out.println("This is "+company+" company laptop, the price is "+price+" and the color is "+color);
	}

	public static void main(String[] args) {
//		making the laptop object
		
		Laptops l1 = new Laptops("hp",65000,"black");
		Laptops l2 = new Laptops("dell",55000,"grey");
		Laptops l3 = new Laptops("vivo",45000,"white");
		
		System.out.println("This is "+l1.company+" company laptop, the price is "+l1.price+" and the color is "+l1.color);
		
		System.out.println("*************************");
//		doing the same with the non static method
		
		l1.details();
		l2.details();
		l3.details();
		
		
		

	}

}
