package Static_Block_and_Non_Static_Block;

public class Static_Block {
	
	/*
	 * static block -> this block is used to change the value of the static member in the class block
	 * static block is prefixed by the static keyword and this is enclosed in the { }
	 * changes/modification can be done of the static variable in the static block
	 */
	
	static int previous=151;
	static int changed=previous;
	
	static {
//		now changing the value of the static variable
		changed=10;
		System.out.println("This is the static block which is executed at the time of the class loading.");
	}
	

	public static void main(String[] args) {
		System.out.println("The previous value is :"+previous);
	
		System.out.println("The previous value is changed and it becomes : "+changed);

	}

}
