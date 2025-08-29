package abstraction_concepts;
/*
 * interface -> interface is similar to the abstraction
 * 
 * Rules for the interface
 * 1) interface can extends the interface
 * 2) class can only implements the interface
 * 
 * interface cannot be extended, instead of the extend keyword we use implements keyword
 * 
 * What are the key points which should be considered for the interface
 * 1) since interface is an abstract, then we cannot make the object reference of the interface
 * 2) interface can be implemented to the other class
 * 3) non static variable is not allowed in the interface
 * 4) constructors are not allowed in the interface, because non static variables are not allowed in the interface
 * 5) by default the method declaration in the interface is public abstract, and it is implicitly done by the compiler if we don't do it explicitly
 * 6) by default the variables declared in the interface are public static final, here if we don't do it manually or explicitly then the compiler do it for us implicitly.
 * 7) method can be declared in the interface only and only if it is prefixed with the default keyword
 * 8) interface allows us the multiple inheritance indirectly
 * since, there can't be two parents of a single child but this is possible by the help of interface.
 * 
 */

interface Animal {
	
//	we can declare a method by the help of the default keyword which is the access modifier also
	default  void details() {
		System.out.println("This is the default method which is defined in the interface.");
		
	}
	
//	Animal(){
//	               this declaration of the constructor in the interface gives the CTE	
//	}
	
//	static and non static blocs are not allowed in the interface
//	static {
//		
//	}

//	{
//		
//	}
	
	
//	method with the default keyword prefixed is allowed in the interface
	default void check() {
		System.out.println("This is the default keyword prefixed method declared inside the interface.");
	}
	
	public abstract void sub(); // if we don't give the public abstract is optional.(Implicit and the explicit)
	
	void mul(int a, int b); //here in this method declaration by default implicitly the method is declared as public abstract void mul();

	public static final int n = 151; // here we have added the public static final explicitly, we don't add it the compiler will add it
	
//	lets see the example of implicit addition of the public static final in the interface 
	int x = 97;
	
}


// declaration of other interface to verify the multiple inheritance
interface Humans{
	
	public abstract void sub();
	
}



public class Dog implements Animal,Humans{
	
//	now  we  need to override such details where that is available
	
//	now we need to override the parent method in the child class which is a abstract class
	
	@Override
	public void sub() {
		System.out.println("This is the payment which is left to be done after overridding of the abstract interface.");
	}
	
	@Override
	public void mul(int a, int b) {
		System.out.println("The multiplication of the two given no is : "+(a*b));
		
	}
	
//	declaration of the child constructor
	Dog(){
		System.out.println("This is the child class constructor which is called at the time of making of the object of the Child class.");
	}
	
	
public static void main(String[] args) {
		
//	making the object and the reference variable

//	here the new keyword creates a new block of memory along with the constructor calling statement and assigned to the reference variable
	
	Dog   d =  new Dog();
	
//	calling the sub method by the help of the reference variable
	d.sub();
	d.mul(4, 10);
	
//	accessing the public static final variable of the interface class
	System.out.println("The given data is which is the final data in the parent class is  "+d.n);
	System.out.println("The other interface variable is : "+d.x );
	
	
//	accessing the default prefixed method of the interface
	d.check();
	
	}
}


