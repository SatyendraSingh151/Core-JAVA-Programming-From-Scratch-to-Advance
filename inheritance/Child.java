package inheritance;
class Parent{
	
//	declaring the static method
	public static void home() {
		System.out.println("Yes, home is there");
	}
}

public class Child extends Parent{

	public static void main(String[] args) {
		// accessing parent method directly
		System.out.println("accessing parent method directly ");
		home();
		System.out.println();
		
		System.out.println("accessing parent method by parent class name");
		// accessing parent method by parent class name
		Parent.home();
		System.out.println();
		
		// accessing parent method by parent class obj ref
		System.out.println("accessing parent method by parent class obj ref");
		Parent p = new Parent();
		p.home();
		System.out.println();
		
		// accessing parent method by child extended parent class 
		System.out.println("accessing parent method by child extended parent class ");
		Child.home();
		System.out.println();
		
		// accessing parent method by child extended parent class obj ref
		System.out.println("accessing parent method by child extended parent class obj ref");
		Child c = new Child();
		c.home();
		

	}

}
