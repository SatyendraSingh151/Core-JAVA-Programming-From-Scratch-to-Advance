package abstraction_concepts;

// declaration of the abstract class
abstract class Father{
//	declaration of the abstract method in the abstract class
	public abstract int update(int n);
	
	
//	declaration of the final variable
	final String name = "Satya Yadav";
	
//	declaration of the final method
	public final void data() {
		System.out.println("This is the dummy data to show the final method extension in child class");
	}
}
public class Final_Method_And_Final_Variable extends Father {
	
//	overriding the abstract method of the abstract class
	@Override
	public int update(int n) {
		return ++n;
	}

	public static void main(String[] args) {
		// making the object of the child class who is extending the abstract method
		
		Final_Method_And_Final_Variable f = new Final_Method_And_Final_Variable();
		
//		calling the override method
		System.out.println("The updated data is : "+f.update(150));
		
//		calling the final non static variable
		System.out.println("The final name is  : "+f.name);
		
//		calling the final non static method
		f.data();

	}

}
