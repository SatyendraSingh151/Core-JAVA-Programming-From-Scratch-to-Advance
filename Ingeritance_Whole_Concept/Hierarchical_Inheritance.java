package Ingeritance_Whole_Concept;
// This is the example of the hierarchical inheritance



class Animal{
	void eats() {
		System.out.println("Yes, all animal eats food.");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dogs bark on the street.");
	}
}
class Cat extends Animal{
	void bark() {
		System.out.println("The cat Meao.");
	}
}

public class Hierarchical_Inheritance extends Animal {
	void demo() {
		System.out.println("This is the demo program which is the example of the hierarchical inheritance.");
	}
	 
	public static void main(String[] args) {
		
		Hierarchical_Inheritance h = new Hierarchical_Inheritance();
		h.demo();
		
		Cat c = new Cat();
		c.bark();
		
		Dog d = new Dog();
		d.bark();
		
		Animal a = new Animal();
		a.eats();
		
	}

}
