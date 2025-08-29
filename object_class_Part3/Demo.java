package object_class_Part3;

// here toString() is already available in the java.lang package
 
public class Demo { // here by default the parent is Object class

	public static void main(String[] args) {
//		here when we create the object and print the reference variable toString() is called implicitly
		
		Demo d = new Demo();

		System.out.println("Explicitly done = "+d.toString());
		
		System.out.println("\nImplicitly done  = "+d);
	}

}
