package Constructor_chaining;

public class Student {
	Student(int rNo){
		System.out.println("Welcome to this college.");
		System.out.println("The Roll no of the student is : "+ rNo);
		
	}
	Student(int rNo, String name){
		this(rNo);
//		System.out.println("Welcome to this college.");
//		System.out.println("The Roll no of the student is : "+ rNo);
		System.out.println("Name is : "+ name);
		}
	Student(int rNo, String name,String address){
		this(rNo,name);
//		System.out.println("Welcome to this college.");
//		System.out.println("The Roll no of the student is : "+ rNo);
//		System.out.println("Address is : "+ address);
		System.out.println("Welcome to this college.");
		
	}

	public static void main(String[] args) {
//		this is the main method
	
		System.out.println("This is the main method ");
		new Student(151, "Satya", "Varanasi");
		System.out.println("***********************");
		new Student(152,"Nancy","Delhi");
		

	}

}
