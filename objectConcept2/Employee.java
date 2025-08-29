package objectConcept2;

public class Employee {
	String name;
	int id;
	String address;
	String gender;
	public void details() {
		System.out.println("Name is " +name );
		System.out.println("Id is " +id );
		System.out.println("Address is " +address );
		System.out.println("Gender is " +gender );
		
	}

	public static void main(String[] args) {
		// making object 
		
		Employee emp1 = new Employee();
		emp1.name = "Satya";
		emp1.id = 151;
		emp1.address = "Varanasi";
		emp1.gender ="Male";
		
		Employee emp2 = new Employee();
		emp2.name = "Nancy";
		emp2.id = 97;
		emp2.address = "Varanasi";
		emp2.gender ="Female";
		
//		now calling non-static method
		
		emp1.details();
		
		System.out.println("************************************* ");
		
		emp2.details();

	}

}
