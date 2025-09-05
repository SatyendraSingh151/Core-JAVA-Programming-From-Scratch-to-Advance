package Ingeritance_Whole_Concept;

// making a single level constructor which haves only one parent and only one child
class Superior{
	
//	declaration of a non static method
	public void properties() {
		System.out.println("This is the parent property to which child is going to extend.");
	}
}

public class Single_Level_inheritence2 extends Superior {

//	this is the child own declared method
	public void data() {
		System.out.println("This is the childs data which is the child own property other than the parent.");
	}
	
	public static void main(String[] args) {
		
// making the object of the child class which haves the parents property too
		Single_Level_inheritence2 child = new Single_Level_inheritence2();
		child.properties();
		child.data();
		
	}

}
