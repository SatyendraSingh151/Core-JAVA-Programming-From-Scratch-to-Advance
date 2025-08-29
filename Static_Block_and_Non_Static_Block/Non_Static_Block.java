package Static_Block_and_Non_Static_Block;

public class Non_Static_Block {
	/*
	 * non static block -> this block is executed at the time of of the object creation
	 * non static block is enclosed in {  }
	 */
	
	{
		System.out.println("This is the non static block which is loaded at the time of object creation.");
	}

	public static void main(String[] args) {
		
		new Non_Static_Block();
		System.out.println("This is the main block");
		

	}

}
