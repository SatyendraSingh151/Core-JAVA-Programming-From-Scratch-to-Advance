package Polymorphism_Whole_Concept;
/*
 * polymorphism -> polymorphism is the concept to achieve the method overloading and the method overriding concept
 * method overloading -> this is achieved at the time of compile time
 * method overriding -> this is achieved at the time of runtime
 * 
 * we use @Override annotation to tell the compiler to strictly check and verify whether the overriding is achieved or not
 * 
 * for method overriding having Is- a - relationship is compulsory to be there
 * 
 * here in the method overriding the parent properties are overridden in the child class
 * 
 */

class Parentt{
	void prop() {
		System.out.println("The parent is having the precious properties and has struggled very much to get the success in the life.");
	}
	
	String carr;
	Parentt(String carr){
		this.carr=carr;
	}
	void car() {
		System.out.println("The parent is having the "+carr+ " car.");
	}
}

public class Method_Overriding  extends Parentt{
	
	Method_Overriding(String carr) {
		super(carr);
		
	}

	@Override
	void prop() {
		System.out.println("This is the child property");
		
	}
	
	@Override
	void car() {
		System.out.println("Thiis is the child car");
		
	}
	

	public static void main(String[] args) {
		Method_Overriding r = new Method_Overriding("Scorpio");
		Parentt p = new Parentt("Bloero");
		r.car();

	}

}
