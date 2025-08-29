package nancy;



public class Car {
	
	Car(String name)
	{
		System.out.println("Details of cars are :");
		System.out.println("name : "+name);		//System.out.println("name :+name"); isme tumne concatenation galat kiya hai
	}
	
	Car(String name,double price ){
		this(name);
		System.out.println("price : "+price);//System.out.println("price :+price"); isme tumne concatenation galat kiya hai
		
	}
	


	public static void main(String[] args) {
		System.out.println("main method");
		new Car("Honda City",180124); // yha pr hum pahle jyade information wala constructor call kr ke tab kam info wala constructor me this() ka use karenge
/* isi liye yha pr hum 2 parameter wala constructor ko call kr rhe hai or wha se iske paas i parameter hai usko this(parameter pass kr ke ) se call kr lenge */

	}

}
