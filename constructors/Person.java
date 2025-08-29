package constructors;

public class Person {

	//constructor
	public Person(String name, int id, String company) {
		System.out.println("constructor has started");
		System.out.println("name : "+name);
		System.out.println("id : "+id);
		System.out.println("company : "+company);
		
	}

	public static void main(String[] args) {
		// main method
		System.out.println("Main method has started\n");
		new Person("Satya",151,"QJspider");
		System.out.println("\nMain method has ended");

	}

}
