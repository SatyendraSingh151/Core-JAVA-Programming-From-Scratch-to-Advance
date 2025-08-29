package constructors;

public class Car {
	String type;
	int noOfTyres;
	String color;

	public Car(String tpe, int t, String clr) {
	// initialize the value
		type=tpe;
		noOfTyres=t;
		color=clr;
	}

	public static void main(String[] args) {
		//making the objects we want
		Car c1 = new Car("4 Wheeler Mahindra Car",4,"Black");
		Car c2 = new Car("12 Wheeler Tata Truck",12,"Orange & Red Mixed");
		Car c3 = new Car("6 Wheeler Spice Jet Aeroplane",6,"White");

		System.out.println("Vehicle type : "+c1.type+", No Of Tyres having : "+c1.noOfTyres+", and the colour is : "+c1.color);
		System.out.println("*************************************");
		System.out.println("Vehicle type : "+c2.type+", No Of Tyres having : "+c2.noOfTyres+", and the colour is : "+c2.color);
		System.out.println("*************************************");
		System.out.println("Vehicle type : "+c3.type+", No Of Tyres having : "+c3.noOfTyres+", and the colour is : "+c3.color);
	}

}
