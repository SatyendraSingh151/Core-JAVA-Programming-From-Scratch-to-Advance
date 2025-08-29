package super_Keyword;

class Parent{
	public void name(String name) {
		System.out.println("Father's name is : "+name);
	}
}

public class Child extends Parent {
	public void name(String name) {
		System.out.println("Son's name is : "+name);
	}
	
	Child(){
		name("Satya");
		super.name("Ramjee");
		
	}

	public static void main(String[] args) {
		// main method
		
		System.out.println("This is the main method\n");
		
		Child c = new Child();

	}

}
