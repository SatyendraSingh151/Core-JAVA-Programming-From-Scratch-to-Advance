package abstraction_concepts;

// declaration of the abstract class
abstract class Parent7{

//	declaration of the abstract method
	abstract void demo();
	
//	declaration of the static method in the abstract class
	static void task1() {
		System.out.println("This is the static method in the abstract class");
	}
	
//	declaration of the non static method in the abstract class
	void task2() {
		System.out.println("This is the non static method of the abstract class");
	}
}

public class Static_And_NonStatic_Method_In_Abstract_Class extends Parent7{
	
//	overriding the abstract method of the abstract class
	@Override
	public void demo() {
		System.out.println("This is the abstract method which is overriden in the child class");
	}

	public static void main(String[] args) {
		// making the object of the child class who has extended the abstract class
		Static_And_NonStatic_Method_In_Abstract_Class c =new Static_And_NonStatic_Method_In_Abstract_Class();
		
//		calling the abstract method of the abstract class overridden in the child class
		c.demo();
		
//		calling the static method of the abstract class
		c.task1();
		
//		calling the non static method of the abstract class
		c.task2();
		
	}

}
