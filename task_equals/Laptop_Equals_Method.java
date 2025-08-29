package task_equals;

import object_class_Part3.Person;

public class Laptop_Equals_Method {
	String brand;
	double price;
	 
	Laptop_Equals_Method(String brand, double price ){
		this.brand=brand;
		this.price=price;
		
	}

	
	@Override
	public boolean equals(Object o) {
//		here down casting is done
		Laptop_Equals_Method l = (Laptop_Equals_Method)o;
		
		return (this.brand==l.brand)&&(this.price==l.price);
	}
	

	public static void main(String[] args) {
		
		Laptop_Equals_Method l1 = new Laptop_Equals_Method("HP",65000);
		Laptop_Equals_Method l2 = new Laptop_Equals_Method("HP",65000);

		System.out.println("Checking whether the data passed is same or not. "+l1.equals(l2));

	}

}
