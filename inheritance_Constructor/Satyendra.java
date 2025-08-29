package inheritance_Constructor;
class RamjeeSingh{
	RamjeeSingh(){
		System.out.println("This is the parent class constructor");
	}
}

public class Satyendra extends RamjeeSingh{
	Satyendra(){
		System.out.println("This is the child class constructor");
		
	}

	public static void main(String[] args) {
		
		
		
		System.out.println("This is the main handeling of the program");
		new Satyendra();
		
	}

}
