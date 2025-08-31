package abstraction_concepts;


// declaring the abstract class
abstract class Parents{
	
//	declaration and the initialization of the static variable in the abstract class
	static int rollNo = 151;
	
//	declaration and the initialization of the non-static variable in the abstract class
	String name = "Satya Yadav";
}

public class Static_And_NonStatic_Variable_In_Abstract_Class extends Parents {

	public static void main(String[] args) {
		// making the object of the child class which extends the Parents class
		
		Static_And_NonStatic_Variable_In_Abstract_Class c = new Static_And_NonStatic_Variable_In_Abstract_Class();
		
//		calling the static variable
		System.out.println("The roll no is : "+rollNo);
		
//		calling the non static variable
		System.out.println("The name is : "+c.name);

	}

}
