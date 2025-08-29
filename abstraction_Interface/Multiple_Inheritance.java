package abstraction_Interface;

interface Parent1{
	void work();  //public abstract by default 
	
}

interface Parent2{
	void work();  //public abstract by default 
	
}

public class Multiple_Inheritance implements Parent1, Parent2{
	
	@Override
	public void work() {
		System.out.println("The work is being done.");
		
	}
	public static void main(String[] args) {
		
		Multiple_Inheritance m= new Multiple_Inheritance();
		m.work();
		
		System.out.println(" \" JAVA  \" ");
		System.out.println("The address is " +m);
	}

}
