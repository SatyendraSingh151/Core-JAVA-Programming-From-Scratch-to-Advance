package Polymorphism_Whole_Concept;

public class Method_Overloading2 {
	
//	declaring multiple function with same name to achieve the concept of method overloading 
//	It is not compulsory to have Is- a - relationship to achieve the method overloading concept of polymorphism
	public void details(String gName) {
		System.out.println("The Grand Parent  name is "+gName);
	}
	
	public void details(String gName,String fName) {
		System.out.println("The Grand Parent  name is "+gName+". The Father's name is "+fName);
	}
	
	public void details(String gName,String fName,String cname) {
		System.out.println("The Grand Parent  name is "+gName+". The Father's name is "+fName+" and the chile name is "+cname);
	}

	public static void main(String[] args) {
		
//		now we can call the non static methods by the help of object reference
		
//		here new keyword creates a new block of memory and it is assigned in the reference type of variable
		Method_Overloading2 ref = new Method_Overloading2();
		
//		now calling the methods with passing the different parameters and based on the parameters method overloading is applied at the time of compile time
		ref.details("Shiv Kumar Yadav");
		
		ref.details("Shiv Kumar Yadav","Ramjee Singh");
		
		ref.details("Shiv Kumar Yadav","Ramjee Singh", "Satyendra Singh");
		
		
		

	}

}
