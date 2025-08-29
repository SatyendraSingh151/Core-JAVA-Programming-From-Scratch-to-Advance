package Encapsulation_Concept;
/*
 * Inheritance -> this is the type of the OOPs concept which is used to extend the parent features
 * extend keyword is used to inherit the properties
 * Inheritance is used to maintain the security and this is generally used by private access modifier
 */
class Parent{
	private String name;


	
//	setter for the name
	public void setName(String name) {
		this.name=name;
	}
	
//	getter for the name
	public String getName() {
		return name;
	}
	
	public void property() {
		System.out.println("Owns his own \"Land\" and \"House\"");
	}
}

public class Child extends Parent{
	String name;
	
	Child(String name){
		
		this.name=name;	
		
	}
	public void property() {
		super.property();
		System.out.println("The child has his own car");
	}

	public static void main(String[] args) {
		
		Child c = new Child("Satya Yadav");
		
		c.setName("Ramjee Singh");
		System.out.println("The name passed to the parent is "+c.getName());
		c.property();
	}

}
