package abstraction_concepts;

// making the abstraction class which consists of the abstract class
abstract class Superior_Parent{
	
//	declaration of the abstract methods in the abstract class
	public abstract void sum();
	public abstract void details();
	
}
 
public class Abstraction_Of_Class  extends Superior_Parent{

//	we need to override the abstract declared methods
	@Override
	public  void sum() {
		int a=5,b=10;
		System.out.println("The sum of the values are = "+(a+b));
	}
	@Override
	public  void details() {
		System.out.println("Hello boss! This is the example of the overriding in the abstract class.");
	}
	
	public static void main(String[] args) {
		// making the object of the child class (we cannot make the object of the abstract class)
		Abstraction_Of_Class ref = new Abstraction_Of_Class();
//		calling the abstract overridden methods of the abstract class
		ref.sum();
		ref.details();

	}

}
