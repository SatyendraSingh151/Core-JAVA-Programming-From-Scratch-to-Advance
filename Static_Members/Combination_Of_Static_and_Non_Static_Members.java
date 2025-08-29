package Static_Members;
// this program is the combination of the static and the non static members together

public class Combination_Of_Static_and_Non_Static_Members {

//	static variable and the non static variable
	static int rno=151;
	static void details(String name) {
		System.out.println("This is the static method");
		System.out.println("The roll  no of the candidate is : "+rno+" and the name of the candidate is : "+name);
	}
	
//	non static variable and the non static method
	String name;
	long phno;

	
	Combination_Of_Static_and_Non_Static_Members( String name, long phno, String address){
		this.name=name;
		this.phno=phno;
		System.out.println("non static variable is assigned the value by the help of  the constructor.");
		
		
	}
	
	public void visit(String address) {
		System.out.println("This is the non static method.");
		System.out.println("This person has come to visit from "+address);
		
	}
	
	
	
	public static void main(String[] args) {
		
//		calling the static member
		System.out.println("The default roll no given to the candidate is "+rno);
		details("Satya");
		
		System.out.println();
//		calling the non static members
		
		Combination_Of_Static_and_Non_Static_Members n = new Combination_Of_Static_and_Non_Static_Members("Satyendra",8004560467l,"From India");
		System.out.println("The name is : "+n.name );
		System.out.println("The contact no is : "+n.phno);
		
		n.visit("India");
		

	}

}
