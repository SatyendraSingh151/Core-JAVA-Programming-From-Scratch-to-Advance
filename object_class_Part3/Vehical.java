package object_class_Part3;

public class Vehical {
	String brand,color;
	double price;
	
	Vehical(String brand, String color, double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return "toString() has been Overriden explicitly";
	}
	
	@Override
	public boolean equals(Object o) {
//		down-casting 
		Vehical v = (Vehical)o;
		return (this.brand==v.brand) && (this.color==v.color) && (this.price==v.price);
		
	}

	public static void main(String[] args) {
		Vehical v1 = new Vehical("Toyata","Black", 5023452);
		
//		getting the toString()
		
		System.out.println(v1.toString());
		
//		checking the equals method
		Vehical v2 = new Vehical("Mahindra","Black", 5023452);
		
		System.out.println("Smae or not : "+v1.equals(v2));
		
		

	}

}
