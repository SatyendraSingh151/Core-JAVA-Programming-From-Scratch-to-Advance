package objectCreation3;
class Students{
//	declaring the static variables
	static String college="Kashi Institute Of Technology";
}

public class Person {

	

	public static void main(String[] args) {
		
		
	
		
//		accessing the static variable by using the class name
		System.out.println("Belongs to "+Students.college +" college.");
		System.out.println("*******************");
		
//		accessing the static variable by using the object reference
		Students s1 = new Students();
		System.out.println("Belongs to "+s1.college +" college.");
		

	}

}
