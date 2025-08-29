package Ingeritance_Whole_Concept;

class Parent2{
	public void details() {
		System.out.println("This is the parent data");
	}
}

public class Single_Level_Inheritance extends Parent2{
	
	public void details() {
		super.details();
		System.out.println("This is the child data");
	}

	public static void main(String[] args) {
		
		Single_Level_Inheritance n = new Single_Level_Inheritance();
		n.details();

	}

}
