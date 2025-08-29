package Static_Block_and_Non_Static_Block;

/*
 * execution is done as the sequence of static block > main method > non static block at the time of object creation > constructor
 */
public class Combination_Of_Static_and_Non_Static_Block {
	
	
	static {
		System.out.println("This is the static block which is executed at the time of the class loading");
	}
	
	{
		System.out.println("This is the non static block which is executed at the time of the object creation.");
	}
	{
		System.out.println("This is the 2nd non static block.");
	}
	static {
		System.out.println("This is the 2nd static block.");
	}
	
	Combination_Of_Static_and_Non_Static_Block(){
		System.out.println("This is the constructor of the class.");
	}

	
	public static void main(String[] args) {
		
		System.out.println("This is the main method block.");
		
		new Combination_Of_Static_and_Non_Static_Block();
		
		

	}

}
