package default_access_modifier;

public class Student {
	
//	default access modifier
	
	static String name="Satya";
	static void details() {
		System.out.println(name + " has the emp id as 151");
	}

	public static void main(String[] args) {
		
		System.out.println("The name is : "+name);
		details();

	}

}
