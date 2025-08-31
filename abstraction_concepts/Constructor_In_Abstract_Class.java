package abstraction_concepts;

// making the abstract class
 abstract class Super{
	
//	 declaration of the abstract class
	 abstract void demo();
	 
//	 making the constructor
	 Super(){
		 System.out.println("This is the constructor in the abstract class");
	 }
	 
}

public class Constructor_In_Abstract_Class extends Super{
	
//	overriding the abstract method
	@Override
	public void demo() {
		System.out.println("This is the overriden method of the abstract class done in the child class.");
	}

	public static void main(String[] args) {
		// making the object of the child class

		Constructor_In_Abstract_Class c = new Constructor_In_Abstract_Class();

//		calling the non static method of the abstract class extended in the child class
		c.demo();
	}

}
