package Interface_Abstract_Concept;

// declaration of the interface
interface Parent{
	
//	declaration of the abstract method in the interface
	public abstract void demo(); // if we don't write the public abstract then the compiler does this for us
	
	
//	declaration of the final variable in the interface
	public static final String name = "Satya Yadav";
}

public class Final_Variable_In_Interface implements Parent{
	
//	overriding the abstract method of the interface
	@Override
	public void demo() {
		System.out.println("This is the overriden method of the interface class in the child class");
	}

	public static void main(String[] args) {
		// making the object of the child class which implements the interface

		Final_Variable_In_Interface c = new Final_Variable_In_Interface();
		
//		calling the overridden method 
		c.demo();
		
//		calling the final variable of the interface
		System.out.println("The name is : "+c.name);
	}

}
