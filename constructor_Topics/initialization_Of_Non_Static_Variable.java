package constructor_Topics;

public class initialization_Of_Non_Static_Variable {

//	non static variables
	int rollNo;
	String name,address;
	long phNo;
	
//	defining the constructor for the initialization of the non static variables
	initialization_Of_Non_Static_Variable( int rollNo, String name, String address,long phNo){
		System.out.println("Now,the constructor is executed when the object is created");
		this.rollNo=rollNo;
		this.address=address;
		this.name=name;
		this.phNo=phNo;
	}
	
	public static void main(String[] args) {
		System.out.println("First of all the main blocks start the execution, called by theJVM.");
		
//		the non static members can only be used if and if the object reference is made and the constructor is called at the time of object creation
//		making the object reference of the class to access the non static variables 
		initialization_Of_Non_Static_Variable ref = new initialization_Of_Non_Static_Variable(151,"Satya","From Buxar distrct of Bihar",8004560467l);
		System.out.println("The roll no of the student is " +ref.rollNo);
		System.out.println("The name of the candidate is " +ref.name);
		System.out.println("The candidate belongs to the given address. -> "+ref.address);
		System.out.println("The contact no is " +ref.phNo);
		
		System.out.println("This is the end of the main body");

	}

}
