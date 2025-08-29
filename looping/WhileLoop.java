package looping;

public class WhileLoop {

	public static void main(String[] args) {
		// Initialization is to be done first
		
		int count = 1;
		
//		defining the while loop
		
		while(count<=5)
		{
			System.out.println("This is * ");
			count+=count;
		}
		
		System.out.println("The loop has been terminated now. " );
		
		
		int b=1;
		while(b<6) {
			System.out.println("***");
			b++;
		}
	}

}
