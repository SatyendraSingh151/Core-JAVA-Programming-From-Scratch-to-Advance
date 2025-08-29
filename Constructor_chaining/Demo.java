package Constructor_chaining;

public class Demo {
	Demo(){
		System.out.println("This is constructor");
	}
	Demo(int serialNo){
		this(); // this() helps to reduce the line of code and it calls the constructor  based on the actual arguments of this()
//		System.out.println("This is constructor");
		System.out.println("Serial No : "+serialNo);
	}


	public static void main(String[] args) {
		new Demo(12546);
//		by making only one object we are calling multiple constructor
		
	}

}
