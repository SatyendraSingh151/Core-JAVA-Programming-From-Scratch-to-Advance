package abstraction_concepts;
/*
 *abstraction -> if a class is having the abstract  methods then it is compulsory to make the class as a abstract class
 *to achieve the abstraction Is- a - relationship is must
 *the abstract class must be overridden and to verify the override concept we use the @Override annotation
 *
 *syntax to declare the abstract method
 *
 * public abstract void details(); 
 * 
 * creation of the object of a abstract class is not possible it will give the CTE
 * 
 * What members the abstract class can have
 * 1) abstract class cannot be made the object reference
 * 2) constructors are allowed in the abstract class
 * 3) static and the non static variables are allowed inside the abstract class
 * 4) constructors are allowed in the abstract class
 * 5) static and non static blocks are allowed in the abstract class
 * 6) static and the non static methods are also allowed in the abstract class
 *
 */
abstract class  Parent{
	
//	declaring the abstract method
	public abstract void details(); 
	
//	declaring the static and non static variable
	int a=10;
	static int b=20;
	
//	constructors in the abstract class

	Parent(){
		System.out.println("This is the constructor of the Parent in the abstract class. This will be called at the time of the object creation.");
	}
	
//	static block inside the abstract class
	static {
		System.out.println("This is the static block inside the abstract class");
	}
	
//	non static block inside the abstract class
	{
		System.out.println("This is the non static block of the abstract class.");
	}
	
	public static void parent_name(String name){
		System.out.println("This method is the static method declared in the Parent class. The father's name is "+name);
		
	}
	
	public void child_name(String name) {
		System.out.println("This is the non static method declared in the Parent class. The child name is "+name);
	}
	 
}



public class Child extends Parent{

//	here we need to override the abstract method
	@Override
	public void details() {
		System.out.println("This is the data which has been declared as the abstract method in the Parent class is changed of the method in the child class.");
		
	}
	
//	constructor of the Child class
	Child(){
		System.out.println("This is the child constructor in the child class.");
	}
	public static void main(String[] args) {
		
//		making the object reference for the class

//		here new keyword creates the new keyword with the constructor calling statement and it is assigned to the reference variable

		Child c= new Child();
		
//		accessing the non static method declared and overridden
		
		c.details();

//		accessing the static variable in the main method
		System.out.println("the static variable declared in the Parent class is extended to the Child class  is accessed directly "+b);
		
//		accessing the non static variable by the reference of the object reference
		System.out.println("The non static variable  declared in the Parent class is extended to the Child class and is is accessed by the help of the object reference variable is "+c.a);
		
//		accessing the static method declared in the Parent class
		parent_name("Ramjee Singh");
		c.child_name("Satyendra Singh");
		

	}

}
