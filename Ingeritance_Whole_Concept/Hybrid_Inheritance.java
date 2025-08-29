package Ingeritance_Whole_Concept;
// hybrid inheritance is the inheritance concept which has the combination of two types of inheritance

// this is the multilevel classes below
class Parent3{
	public void sum() {
		System.out.println("This is the void sum program.");
	}
}

class Child3 extends Parent3{
	public void demo() {
		System.out.println("This is the child class");
	}
}

class GrandChild extends Child3{
	public void prop() {
		System.out.println("This is the Grand Child class.");
	}
}


// this is the hierarchical class

class Humans extends Parent3{
	void nature() {
		System.out.println("This is the nature of humans to survive.");
	}
}

class Animal2 extends Parent3{
	void jungle() {
		System.out.println("The animal lives in the jungle.");
	}
}

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		
//		making the object of the multilevel extends classes
		GrandChild g = new GrandChild();
		g.demo();
		g.prop();
		g.sum();
		
		System.out.println();
		
//		making the object of the hierarchical classes
		Humans h = new Humans();
		h.sum();
		h.nature();
		
		System.out.println();
		
		Animal2 a = new Animal2();
		a.sum();
		a.jungle();
		

	}

}
