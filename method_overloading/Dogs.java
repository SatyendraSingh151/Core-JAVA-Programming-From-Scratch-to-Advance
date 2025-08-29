package method_overloading;

class Animal{
	
	 void food() {
		System.out.println("\nAll animals eats food.");
	}
	
	 void legs() {
		System.out.println("\nAll animals have their legs.");
	}
	
	 void pets() {
		System.out.println("\nAll animals are not pets.");
	}
	
}

public class Dogs extends Animal {
	
//	we can increase the visibility of the access  modifiers
	
	@Override
	protected void food() {
		System.out.println("\nThe dogs are vegetarian and non vegetarian both.");
	}
	
	@Override
	public void legs() {
		System.out.println("\nDogs have 4 legs.");
	}
	
	@Override
	protected void pets() {
		System.out.println("\nDogs are pets.");
	}
	
	
	

	public static void main(String[] args) {
//		doing the overriding
		
		Dogs d = new Dogs();
		
		d.food();
		d.legs();
		d.legs();
		
		System.out.println("\n***************************");
//		we can also access by using the up-casting
		
//		using parent reference and the child object
		Animal a =  new Dogs();
		a.food();
		a.legs();
		a.pets();
		
		
		

	}

}
