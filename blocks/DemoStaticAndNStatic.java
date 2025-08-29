package blocks;

public class DemoStaticAndNStatic {

	DemoStaticAndNStatic() {
		System.out.println("This is constructor");
		
	
	{
		System.out.println("This is non static block 1");
	}
	{
		System.out.println("This is non static block 2");
	}
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		new DemoStaticAndNStatic(); 
		

	}
	static {
		System.out.println("This is static block 1");
		
	}
	static {
		System.out.println("This is static block 2");
		
	}

}
