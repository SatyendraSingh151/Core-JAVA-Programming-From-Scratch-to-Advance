package non_primitive_datatype;

class Person{
	public void breathe() {
		System.out.println("Yes all persons breathes oxygen");
	}
	
	String motion = "work";
}

public class Student extends Person {
	int rno = 151;
	String clg = "KIT";

	public static void main(String[] args) {
		// upcasting the non primitive data type
		
		
//		Making the object for child class and the reference variable of the parent type
		Person s = new Student();
		
		
		s.breathe();
	
		System.out.println("The humans behaviour is to : "+s.motion);
		
		/* we are not allowed to access the 
		 * child members, we can only access the parent
		 * members with the parent referance variable
		 * (or the members common to both)
		 * 
		 * 
		 * 	System.out.println("Roll no : "+s.rno);
		System.out.println("College name : "+s.clg);
		 
		 */
		
		
		
		
// we can also do the explicit the upcasting 
		
		Person p = (Person) new Student();
		
		System.out.println("\nThe nature of the person is : "+p.motion);

		p.breathe();
		
		

	}

}
