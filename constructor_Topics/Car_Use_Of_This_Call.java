package constructor_Topics;

//Constructor_Overloading concept is here
public class Car_Use_Of_This_Call {
	
	String fuel;
	double price;
	double defaultFuel;
	int noOfTyres;
	
	Car_Use_Of_This_Call(String fuel){
		this.fuel=fuel;
		
		
	}
	Car_Use_Of_This_Call(String fuel,double price){
		this.fuel=fuel;
		this.price=price;
		
	}
	Car_Use_Of_This_Call(String fuel,double price, double defaultFuel){
		this.fuel=fuel;
		this.price=price;
		this.defaultFuel=defaultFuel;
		
	}
	Car_Use_Of_This_Call(String fuel,double price, double defaultFuel, int noOfTyres){
		this.fuel=fuel;
		this.price=price;
		this.defaultFuel=defaultFuel;
		this.noOfTyres=noOfTyres;
	}
	

	public static void main(String[] args) {
		
//		making the class object
		
		Car_Use_Of_This_Call c1 = new Car_Use_Of_This_Call("Petrol");
		System.out.println("The fuel type is  "+c1.fuel);
		
		Car_Use_Of_This_Call c2 = new Car_Use_Of_This_Call("Petrol",6500000);
		System.out.println("This car is of "+c2.fuel+" type and the price is "+c2.price);
		
		Car_Use_Of_This_Call c3 =new Car_Use_Of_This_Call("diesel",905424,5);
		System.out.println("This car is of "+c3.fuel+" type, the price is "+c3.price+" and the minimum required fuel for this vehical is "+c3.defaultFuel);
		
		Car_Use_Of_This_Call c4 = new Car_Use_Of_This_Call("petrol",905424,10,5);
		System.out.println("This car is of "+c4.fuel+" type, the price is "+c4.price+" and the minimum required fuel for this vehical is "+c4.defaultFuel+". This car has total no of tyres as "+c4.noOfTyres);
		
		

	}

}
