package Static_Members;

public class Static_Methods {
	/*
	 * static methods also have the same characters as the static variables have
	 * static methods are prefixed with the static keyword
	 * static methods can be accessed within the same class directly
	 * static methods can be accessed by three ways
	 * 1-> directly by the help of the method name
	 * 2-> by using the class name as reference we can call the static methods
	 * 3-> by making the class as object reference we can access the static methods by the help of the reference 
	 */

	public static void details() {
		System.out.println("This is Satya Yadav, from Buxar district of Bihar");
	}
	public static void sum(int a, int b) {
		System.out.println("The sum of "+a+" and "+b+" is = "+(a+b));
	}
	
	public static void main(String[] args) {
	
//		calling the static method directly by method name
		details();
		sum(5,10);
		
//		calling the methods by the help of the class name as reference
		Static_Methods.details();
		Static_Methods.sum(45, 4);
		
//		calling the static methods by making the object reference 
		Static_Methods n= new Static_Methods();
		
		n.details();
		n.sum(8, 7);

	}

}
