package Polymorphism_Whole_Concept;
/*
 * Polymorphism -> this is the concept to achieve method overloading and method overriding 
 * method overloading is achieved at the compile time
 * method overriding is achieved at the time of runtime
 * 
 * 
 * Method overloading -> This is the concept of having more than one method having the same name
 * There are multiple ways to use this concept.
 *
 * 1-> by changing the formal arguments of the method/function
 * 2-> by changing the order of the formal arguments
 * 
 * For method overloading Is-a-relationship concept is not mandatory
 * 
 * the method/function is called on the basis of the parameters which is passed in the calling function
 * 
 */
class Parent{
	
//	declaring the functions having the same name with different parameters i.e the formal arguments
	public void sum() {
		int a=5;
		int b=10;
		System.out.println("The default sum of the value "+a+" and "+b+" is = "+(a+b));
		
	}
	
	public void sum(int a, int b) {
		System.out.println("The sum of the value "+a+" and "+b+" is = "+(a+b));
	}
	
	public void sum(int a, int b,int c) {
		System.out.println("The sum of the value "+a+", "+b+" and "+c+" is = "+(a+b+c));
	}
	public void sum(double a,double b) {
		System.out.println("The sum of the value "+a+" and "+b+" is = "+(a+b));
	}
	public void sum(double a, double b, double c) {
		System.out.println("The sum of the value "+a+", "+b+" and "+c+" is = "+(a+b+c));
	}
	
	public void sum(int ... args) {
		int temp=0;
		
		for (int s : args) {
			temp=temp+s;
		}
		
		System.out.println("The sum of the multiple values passed is = "+temp);
	}
	
	
	public void sum(double ... args) {
		double temp=0;
		
		for (double s : args) {
			temp= (temp+s);
		}
		
		System.out.println("The sum of the multiple values passed is = "+temp);
	}

	
}

public class Method_Overloading extends Parent{

	public static void main(String[] args) {
		
//		now making the object reference of the class
//		here new keyword creates a new block of memory and it is stored in a reference type container
		
		Method_Overloading m = new Method_Overloading();
		
		
//		now calling the methods as the actual parameter is passed
		
//		calling without any parameter
		m.sum();
		
//		calling by passing two parameter
		m.sum(5,45);
		
//		calling the function by passing decimal type value
		m.sum(4.5, 8.4);
		
//		calling the function by passing n no of integer type of parameters
		m.sum(1,2,4,5,5,7,10,8,20);

//		calling the function by passing the n no of decimal type of value
		m.sum(7.41, 7.9, 8.0, 7.6, 8.30);
	}

}
